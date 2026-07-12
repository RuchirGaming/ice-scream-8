package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32904a;

    public mj0(Context context) {
        this.f32904a = context.getApplicationContext();
    }

    public final lj0 a(SSLSocketFactory sSLSocketFactory) {
        return new lj0(this.f32904a, sSLSocketFactory);
    }
}
