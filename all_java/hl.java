package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class hl implements gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gs[] f31342a;

    public hl(gs... gsVarArr) {
        this.f31342a = gsVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.gs
    public final boolean a(Context context) {
        for (gs gsVar : this.f31342a) {
            if (!gsVar.a(context)) {
                return false;
            }
        }
        return true;
    }
}
