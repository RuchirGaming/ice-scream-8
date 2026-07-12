package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class x90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36643a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36644b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36645c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f36646d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36647e = 15;

    public final void a(int i2) {
        int i3 = this.f36645c;
        int[] iArr = this.f36646d;
        if (i3 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i4 = this.f36643a;
            int i5 = length2 - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f36646d, 0, iArr2, i5, i4);
            this.f36643a = 0;
            this.f36644b = this.f36645c - 1;
            this.f36646d = iArr2;
            this.f36647e = length - 1;
        }
        int i6 = (this.f36644b + 1) & this.f36647e;
        this.f36644b = i6;
        this.f36646d[i6] = i2;
        this.f36645c++;
    }

    public final boolean b() {
        return this.f36645c == 0;
    }

    public final int c() {
        int i2 = this.f36645c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f36646d;
        int i3 = this.f36643a;
        int i4 = iArr[i3];
        this.f36643a = (i3 + 1) & this.f36647e;
        this.f36645c = i2 - 1;
        return i4;
    }

    public final void a() {
        this.f36643a = 0;
        this.f36644b = -1;
        this.f36645c = 0;
    }
}
