package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class me0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f32847b;

    public me0(String str, float f2) {
        this.f32846a = str;
        this.f32847b = f2;
    }

    public final float a() {
        return this.f32847b;
    }

    public final String b() {
        return this.f32846a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || me0.class != obj.getClass()) {
            return false;
        }
        me0 me0Var = (me0) obj;
        if (Float.compare(me0Var.f32847b, this.f32847b) != 0) {
            return false;
        }
        String str = this.f32846a;
        if (str != null) {
            return str.equals(me0Var.f32846a);
        }
        return me0Var.f32846a == null;
    }

    public final int hashCode() {
        String str = this.f32846a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        float f2 = this.f32847b;
        return iHashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
