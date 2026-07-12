package com.monetization.ads.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.impl.ga0;
import com.yandex.mobile.ads.impl.t2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class AdResultReceiver extends ResultReceiver implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<t2> f23167a;

    public AdResultReceiver(Handler handler) {
        super(handler);
        this.f23167a = new WeakReference<>(null);
    }

    public final void a(t2 t2Var) {
        this.f23167a = new WeakReference<>(t2Var);
    }

    @Override // android.os.ResultReceiver, com.yandex.mobile.ads.impl.t2
    public final void onReceiveResult(int i2, Bundle bundle) {
        t2 t2Var;
        WeakReference<t2> weakReference = this.f23167a;
        if (weakReference == null || (t2Var = weakReference.get()) == null) {
            return;
        }
        t2Var.onReceiveResult(i2, bundle);
        int i3 = ga0.f30971a;
    }
}
