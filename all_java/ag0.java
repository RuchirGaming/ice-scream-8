package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f29056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29057e;

    public ag0(Object obj) {
        this(obj, -1L);
    }

    public final ag0 a(Object obj) {
        return this.f29053a.equals(obj) ? this : new ag0(obj, this.f29054b, this.f29055c, this.f29056d, this.f29057e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag0)) {
            return false;
        }
        ag0 ag0Var = (ag0) obj;
        return this.f29053a.equals(ag0Var.f29053a) && this.f29054b == ag0Var.f29054b && this.f29055c == ag0Var.f29055c && this.f29056d == ag0Var.f29056d && this.f29057e == ag0Var.f29057e;
    }

    public final int hashCode() {
        return ((((((((this.f29053a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29054b) * 31) + this.f29055c) * 31) + ((int) this.f29056d)) * 31) + this.f29057e;
    }

    public ag0(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public ag0(int i2, long j2, Object obj) {
        this(obj, -1, -1, j2, i2);
    }

    public ag0(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public final boolean a() {
        return this.f29054b != -1;
    }

    protected ag0(ag0 ag0Var) {
        this.f29053a = ag0Var.f29053a;
        this.f29054b = ag0Var.f29054b;
        this.f29055c = ag0Var.f29055c;
        this.f29056d = ag0Var.f29056d;
        this.f29057e = ag0Var.f29057e;
    }

    private ag0(Object obj, int i2, int i3, long j2, int i4) {
        this.f29053a = obj;
        this.f29054b = i2;
        this.f29055c = i3;
        this.f29056d = j2;
        this.f29057e = i4;
    }
}
