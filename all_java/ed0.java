package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ed0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f30351b;

    public ed0() {
        this(0);
    }

    public final void a(long j2) {
        int i2 = this.f30350a;
        long[] jArr = this.f30351b;
        if (i2 == jArr.length) {
            this.f30351b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f30351b;
        int i3 = this.f30350a;
        this.f30350a = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long[] b() {
        return Arrays.copyOf(this.f30351b, this.f30350a);
    }

    public ed0(int i2) {
        this.f30351b = new long[32];
    }

    public final long a(int i2) {
        if (i2 >= 0 && i2 < this.f30350a) {
            return this.f30351b[i2];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.f30350a);
    }

    public final int a() {
        return this.f30350a;
    }
}
