package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class oo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ra1 f33565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ra1 f33566b;

    public oo1(ra1 ra1Var, ra1 ra1Var2) {
        this.f33565a = ra1Var;
        this.f33566b = ra1Var2;
    }

    public final Matrix a(int i2) {
        ra1 ra1Var = this.f33566b;
        boolean z = false;
        if (!(ra1Var.b() > 0 && ra1Var.a() > 0)) {
            return null;
        }
        ra1 ra1Var2 = this.f33565a;
        if (ra1Var2.b() > 0 && ra1Var2.a() > 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return a(1.0f, 1.0f, 1);
        }
        if (i3 == 1) {
            float fB = this.f33565a.b() / this.f33566b.b();
            float fA = this.f33565a.a() / this.f33566b.a();
            float fMin = Math.min(fB, fA);
            return a(fMin / fB, fMin / fA, 2);
        }
        if (i3 != 2) {
            return null;
        }
        float fB2 = this.f33565a.b() / this.f33566b.b();
        float fA2 = this.f33565a.a() / this.f33566b.a();
        float fMax = Math.max(fB2, fA2);
        return a(fMax / fB2, fMax / fA2, 2);
    }

    private Matrix a(float f2, float f3, int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f3, 0.0f, 0.0f);
            return matrix;
        }
        if (i3 != 1) {
            return null;
        }
        float fB = this.f33565a.b() / 2.0f;
        float fA = this.f33565a.a() / 2.0f;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f2, f3, fB, fA);
        return matrix2;
    }
}
