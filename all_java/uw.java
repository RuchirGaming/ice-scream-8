package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class uw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f35949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35950b;

    public uw(int i2, RectF rectF) {
        this.f35950b = i2;
        this.f35949a = rectF;
    }

    public final int a() {
        return this.f35950b;
    }

    public final RectF b() {
        return this.f35949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uw.class != obj.getClass()) {
            return false;
        }
        uw uwVar = (uw) obj;
        if (this.f35950b != uwVar.f35950b) {
            return false;
        }
        RectF rectF = this.f35949a;
        if (rectF != null) {
            return rectF.equals(uwVar.f35949a);
        }
        return uwVar.f35949a == null;
    }

    public final int hashCode() {
        RectF rectF = this.f35949a;
        return ((rectF != null ? rectF.hashCode() : 0) * 31) + this.f35950b;
    }
}
