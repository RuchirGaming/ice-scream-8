package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class f40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<w10> f30626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f30628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f30629e;

    public f40(int i2, ArrayList arrayList) {
        this(i2, arrayList, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f30628d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f30629e != null) {
            return new ByteArrayInputStream(this.f30629e);
        }
        return null;
    }

    public final int b() {
        return this.f30627c;
    }

    public final List<w10> c() {
        return Collections.unmodifiableList(this.f30626b);
    }

    public final int d() {
        return this.f30625a;
    }

    public f40(int i2, ArrayList arrayList, int i3, InputStream inputStream) {
        this.f30625a = i2;
        this.f30626b = arrayList;
        this.f30627c = i3;
        this.f30628d = inputStream;
        this.f30629e = null;
    }

    public f40(int i2, ArrayList arrayList, byte[] bArr) {
        this.f30625a = i2;
        this.f30626b = arrayList;
        this.f30627c = bArr.length;
        this.f30629e = bArr;
        this.f30628d = null;
    }
}
