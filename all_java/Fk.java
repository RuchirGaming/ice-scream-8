package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Fk implements InterfaceC2186ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f24869a;

    Fk(Context context) {
        this(context, new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2186ql
    public Bundle a(Activity activity) {
        return this.f24869a;
    }

    Fk(Context context, Wn wn) {
        ApplicationInfo applicationInfoA = wn.a(context, context.getPackageName(), 128);
        if (applicationInfoA != null) {
            this.f24869a = applicationInfoA.metaData;
        } else {
            this.f24869a = null;
        }
    }
}
