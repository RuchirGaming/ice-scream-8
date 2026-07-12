package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class ChoreographerCallback implements Choreographer.FrameCallback {
    private static final String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private b mLooper;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
        }
    }

    private class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f12524a;

        private b(ChoreographerCallback choreographerCallback) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Log.i(ChoreographerCallback.LOG_TAG, "Starting looper thread");
            Looper.prepare();
            this.f12524a = new Handler();
            Looper.loop();
            Log.i(ChoreographerCallback.LOG_TAG, "Terminating looper thread");
        }
    }

    public ChoreographerCallback(long j2) {
        this.mCookie = j2;
        b bVar = new b();
        this.mLooper = bVar;
        bVar.start();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        nOnChoreographer(this.mCookie, j2);
    }

    public native void nOnChoreographer(long j2, long j3);

    public void postFrameCallback() {
        this.mLooper.f12524a.post(new a());
    }

    public void postFrameCallbackDelayed(long j2) {
        Choreographer.getInstance().postFrameCallbackDelayed(this, j2);
    }

    public void terminate() {
        this.mLooper.f12524a.getLooper().quit();
        try {
            this.mLooper.join();
        } catch (InterruptedException unused) {
        }
    }
}
