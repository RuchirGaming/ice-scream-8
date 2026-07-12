package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1990j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f27142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27143b = false;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j0$a */
    public static class a {
        public C1990j0 a(BroadcastReceiver broadcastReceiver) {
            return new C1990j0(broadcastReceiver);
        }
    }

    public C1990j0(BroadcastReceiver broadcastReceiver) {
        this.f27142a = broadcastReceiver;
    }

    public synchronized Intent a(Context context, IntentFilter intentFilter) {
        Intent intentRegisterReceiver;
        try {
            intentRegisterReceiver = context.registerReceiver(this.f27142a, intentFilter);
            try {
                this.f27143b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intentRegisterReceiver = null;
        }
        return intentRegisterReceiver;
    }

    public synchronized void a(Context context) {
        if (this.f27143b) {
            try {
                context.unregisterReceiver(this.f27142a);
                this.f27143b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
