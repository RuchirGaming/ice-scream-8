package com.google.androidgamesdk;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class SwappyDisplayManager implements DisplayManager.DisplayListener {
    private Activity mActivity;
    private long mCookie;
    private Display.Mode mCurrentMode;
    private b mLooper;
    private WindowManager mWindowManager;
    private final String LOG_TAG = "SwappyDisplayManager";
    private final boolean DEBUG = false;
    private final long ONE_MS_IN_NS = 1000000;
    private final long ONE_S_IN_NS = C.NANOS_PER_SECOND;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f12525a;

        a(int i2) {
            this.f12525a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = SwappyDisplayManager.this.mActivity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.preferredDisplayModeId = this.f12525a;
            window.setAttributes(attributes);
        }
    }

    private class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f12527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Lock f12528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Condition f12529c;

        private b(SwappyDisplayManager swappyDisplayManager) {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f12528b = reentrantLock;
            this.f12529c = reentrantLock.newCondition();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Log.i("SwappyDisplayManager", "Starting looper thread");
            this.f12528b.lock();
            Looper.prepare();
            this.f12527a = new Handler();
            this.f12529c.signal();
            this.f12528b.unlock();
            Looper.loop();
            Log.i("SwappyDisplayManager", "Terminating looper thread");
        }

        @Override // java.lang.Thread
        public void start() {
            this.f12528b.lock();
            super.start();
            try {
                this.f12529c.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            this.f12528b.unlock();
        }
    }

    public SwappyDisplayManager(long j2, Activity activity) {
        String string;
        try {
            Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getIntent().getComponent(), 128).metaData;
            if (bundle != null && (string = bundle.getString("android.app.lib_name")) != null) {
                System.loadLibrary(string);
            }
        } catch (Throwable th) {
            Log.e("SwappyDisplayManager", th.getMessage());
        }
        this.mCookie = j2;
        this.mActivity = activity;
        WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
        this.mWindowManager = windowManager;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        this.mCurrentMode = defaultDisplay.getMode();
        updateSupportedRefreshRates(defaultDisplay);
        DisplayManager displayManager = (DisplayManager) this.mActivity.getSystemService(DisplayManager.class);
        synchronized (this) {
            b bVar = new b();
            this.mLooper = bVar;
            bVar.start();
            displayManager.registerDisplayListener(this, this.mLooper.f12527a);
        }
    }

    private boolean modeMatchesCurrentResolution(Display.Mode mode) {
        return mode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && mode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth();
    }

    private native void nOnRefreshPeriodChanged(long j2, long j3, long j4, long j5);

    private native void nSetSupportedRefreshPeriods(long j2, long[] jArr, int[] iArr);

    private void updateSupportedRefreshRates(Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        int i2 = 0;
        for (Display.Mode mode : supportedModes) {
            if (modeMatchesCurrentResolution(mode)) {
                i2++;
            }
        }
        long[] jArr = new long[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < supportedModes.length; i4++) {
            if (modeMatchesCurrentResolution(supportedModes[i4])) {
                jArr[i3] = (long) (1.0E9f / supportedModes[i4].getRefreshRate());
                iArr[i3] = supportedModes[i4].getModeId();
                i3++;
            }
        }
        nSetSupportedRefreshPeriods(this.mCookie, jArr, iArr);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i2) {
        synchronized (this) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            Display.Mode mode = defaultDisplay.getMode();
            boolean z = true;
            boolean z2 = (mode.getPhysicalWidth() != this.mCurrentMode.getPhysicalWidth()) | (mode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight());
            if (refreshRate == this.mCurrentMode.getRefreshRate()) {
                z = false;
            }
            this.mCurrentMode = mode;
            if (z2) {
                updateSupportedRefreshRates(defaultDisplay);
            }
            if (z) {
                long j2 = (long) (1.0E9f / refreshRate);
                nOnRefreshPeriodChanged(this.mCookie, j2, defaultDisplay.getAppVsyncOffsetNanos(), j2 - (this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos() - 1000000));
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i2) {
    }

    public void setPreferredDisplayModeId(int i2) {
        this.mActivity.runOnUiThread(new a(i2));
    }

    public void terminate() {
        this.mLooper.f12527a.getLooper().quit();
        try {
            this.mLooper.join();
        } catch (InterruptedException unused) {
        }
    }
}
