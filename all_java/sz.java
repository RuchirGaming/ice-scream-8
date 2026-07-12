package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class sz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f35329a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f35330b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tf1<float[]> f35331c = new tf1<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35332d;

    public final void a() {
        this.f35331c.a();
        this.f35332d = false;
    }

    public final void b(long j2, float[] fArr) {
        this.f35331c.a(fArr, j2);
    }

    public final void a(long j2, float[] fArr) {
        float[] fArrB = this.f35331c.b(j2);
        if (fArrB == null) {
            return;
        }
        float[] fArr2 = this.f35330b;
        float f2 = fArrB[0];
        float f3 = -fArrB[1];
        float f4 = -fArrB[2];
        float length = Matrix.length(f2, f3, f4);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f2 / length, f3 / length, f4 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.f35332d) {
            a(this.f35329a, this.f35330b);
            this.f35332d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f35329a, 0, this.f35330b, 0);
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / fSqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / fSqrt;
        fArr[8] = (-f5) / fSqrt;
        fArr[10] = f4;
    }
}
