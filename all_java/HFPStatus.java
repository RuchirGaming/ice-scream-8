package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class HFPStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23913a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f23916d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f23914b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23915c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23917e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f23918f = a.f23920a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23920a = new a("DISCONNECTED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23921b = new a("CONNECTED", 1);

        private a(String str, int i2) {
            super(str, i2);
        }
    }

    public HFPStatus(Context context) {
        this.f23916d = null;
        this.f23913a = context;
        this.f23916d = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    public void a() {
        clearHFPStat();
        deinitHFPStatusJni();
    }

    protected void clearHFPStat() {
        BroadcastReceiver broadcastReceiver = this.f23914b;
        if (broadcastReceiver != null) {
            this.f23913a.unregisterReceiver(broadcastReceiver);
            this.f23914b = null;
        }
        this.f23918f = a.f23920a;
        if (this.f23917e) {
            this.f23917e = false;
            this.f23916d.stopBluetoothSco();
        }
    }

    protected boolean getHFPStat() {
        return this.f23918f == a.f23921b;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                HFPStatus hFPStatus = HFPStatus.this;
                hFPStatus.f23918f = a.f23921b;
                if (hFPStatus.f23917e) {
                    hFPStatus.f23917e = false;
                    hFPStatus.f23916d.stopBluetoothSco();
                }
                HFPStatus hFPStatus2 = HFPStatus.this;
                if (hFPStatus2.f23915c) {
                    hFPStatus2.f23916d.setMode(3);
                }
            }
        };
        this.f23914b = broadcastReceiver;
        this.f23913a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f23917e = true;
            this.f23916d.startBluetoothSco();
        } catch (NullPointerException unused) {
            AbstractC1666u.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.f23915c = z;
        if (z) {
            return;
        }
        this.f23916d.setMode(0);
    }
}
