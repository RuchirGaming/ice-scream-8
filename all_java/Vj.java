package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f26116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f26117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f26118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f26119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f26120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f26125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Long f26126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Integer f26127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Integer f26128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f26129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f26130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f26131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Integer f26132q;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f26133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f26134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f26135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f26136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f26137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f26138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f26139g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f26140h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f26141i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Integer f26142j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Long f26143k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f26144l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Integer f26145m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f26146n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Integer f26147o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Integer f26148p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Integer f26149q;

        public a a(int i2) {
            this.f26141i = i2;
            return this;
        }

        public a b(Integer num) {
            this.f26137e = num;
            return this;
        }

        public a c(Integer num) {
            this.f26136d = num;
            return this;
        }

        public a d(Integer num) {
            this.f26148p = num;
            return this;
        }

        public a e(Integer num) {
            this.f26149q = num;
            return this;
        }

        public a f(Integer num) {
            this.f26144l = num;
            return this;
        }

        public a g(Integer num) {
            this.f26146n = num;
            return this;
        }

        public a h(Integer num) {
            this.f26145m = num;
            return this;
        }

        public a i(Integer num) {
            this.f26134b = num;
            return this;
        }

        public a j(Integer num) {
            this.f26135c = num;
            return this;
        }

        public a k(Integer num) {
            this.f26142j = num;
            return this;
        }

        public a l(Integer num) {
            this.f26133a = num;
            return this;
        }

        public a a(String str) {
            this.f26139g = str;
            return this;
        }

        public a b(String str) {
            this.f26138f = str;
            return this;
        }

        public a a(boolean z) {
            this.f26140h = z;
            return this;
        }

        public a a(Long l2) {
            this.f26143k = l2;
            return this;
        }

        public a a(Integer num) {
            this.f26147o = num;
            return this;
        }
    }

    public Vj(a aVar) {
        this.f26116a = aVar.f26133a;
        this.f26117b = aVar.f26134b;
        this.f26118c = aVar.f26135c;
        this.f26119d = aVar.f26136d;
        this.f26120e = aVar.f26137e;
        this.f26121f = aVar.f26138f;
        this.f26122g = aVar.f26139g;
        this.f26123h = aVar.f26140h;
        this.f26124i = aVar.f26141i;
        this.f26125j = aVar.f26142j;
        this.f26126k = aVar.f26143k;
        this.f26127l = aVar.f26144l;
        this.f26128m = aVar.f26145m;
        this.f26129n = aVar.f26146n;
        this.f26130o = aVar.f26147o;
        this.f26131p = aVar.f26148p;
        this.f26132q = aVar.f26149q;
    }

    public void a(Integer num) {
        this.f26116a = num;
    }

    public Integer b() {
        return this.f26120e;
    }

    public int c() {
        return this.f26124i;
    }

    public Long d() {
        return this.f26126k;
    }

    public Integer e() {
        return this.f26119d;
    }

    public Integer f() {
        return this.f26131p;
    }

    public Integer g() {
        return this.f26132q;
    }

    public Integer h() {
        return this.f26127l;
    }

    public Integer i() {
        return this.f26129n;
    }

    public Integer j() {
        return this.f26128m;
    }

    public Integer k() {
        return this.f26117b;
    }

    public Integer l() {
        return this.f26118c;
    }

    public String m() {
        return this.f26122g;
    }

    public String n() {
        return this.f26121f;
    }

    public Integer o() {
        return this.f26125j;
    }

    public Integer p() {
        return this.f26116a;
    }

    public boolean q() {
        return this.f26123h;
    }

    public String toString() {
        return "CellDescription{mSignalStrength=" + this.f26116a + ", mMobileCountryCode=" + this.f26117b + ", mMobileNetworkCode=" + this.f26118c + ", mLocationAreaCode=" + this.f26119d + ", mCellId=" + this.f26120e + ", mOperatorName='" + this.f26121f + "', mNetworkType='" + this.f26122g + "', mConnected=" + this.f26123h + ", mCellType=" + this.f26124i + ", mPci=" + this.f26125j + ", mLastVisibleTimeOffset=" + this.f26126k + ", mLteRsrq=" + this.f26127l + ", mLteRssnr=" + this.f26128m + ", mLteRssi=" + this.f26129n + ", mArfcn=" + this.f26130o + ", mLteBandWidth=" + this.f26131p + ", mLteCqi=" + this.f26132q + AbstractJsonLexerKt.END_OBJ;
    }

    public Integer a() {
        return this.f26130o;
    }
}
