package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25006a;

    Hi(int i2) {
        this.f25006a = i2;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f25006a);
        return bundle;
    }
}
