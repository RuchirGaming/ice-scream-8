package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class ty {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35602c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35604e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f35600a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f35601b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35603d = C.TIME_UNSET;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f35605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f35607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f35608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f35609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f35610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f35611g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f35612h;

        public final long a() {
            long j2 = this.f35609e;
            if (j2 == 0) {
                return 0L;
            }
            return this.f35610f / j2;
        }

        public final long b() {
            return this.f35610f;
        }

        public final boolean c() {
            long j2 = this.f35608d;
            if (j2 == 0) {
                return false;
            }
            return this.f35611g[(int) ((j2 - 1) % 15)];
        }

        public final boolean d() {
            return this.f35608d > 15 && this.f35612h == 0;
        }

        public final void e() {
            this.f35608d = 0L;
            this.f35609e = 0L;
            this.f35610f = 0L;
            this.f35612h = 0;
            Arrays.fill(this.f35611g, false);
        }

        public final void a(long j2) {
            long j3 = this.f35608d;
            if (j3 == 0) {
                this.f35605a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f35605a;
                this.f35606b = j4;
                this.f35610f = j4;
                this.f35609e = 1L;
            } else {
                long j5 = j2 - this.f35607c;
                int i2 = (int) (j3 % 15);
                if (Math.abs(j5 - this.f35606b) <= 1000000) {
                    this.f35609e++;
                    this.f35610f += j5;
                    boolean[] zArr = this.f35611g;
                    if (zArr[i2]) {
                        zArr[i2] = false;
                        this.f35612h--;
                    }
                } else {
                    boolean[] zArr2 = this.f35611g;
                    if (!zArr2[i2]) {
                        zArr2[i2] = true;
                        this.f35612h++;
                    }
                }
            }
            this.f35608d++;
            this.f35607c = j2;
        }
    }

    public final void a(long j2) {
        this.f35600a.a(j2);
        if (this.f35600a.d()) {
            this.f35602c = false;
        } else if (this.f35603d != C.TIME_UNSET) {
            if (!this.f35602c || this.f35601b.c()) {
                this.f35601b.e();
                this.f35601b.a(this.f35603d);
            }
            this.f35602c = true;
            this.f35601b.a(j2);
        }
        if (this.f35602c && this.f35601b.d()) {
            a aVar = this.f35600a;
            this.f35600a = this.f35601b;
            this.f35601b = aVar;
            this.f35602c = false;
        }
        this.f35603d = j2;
        this.f35604e = this.f35600a.d() ? 0 : this.f35604e + 1;
    }

    public final float b() {
        if (this.f35600a.d()) {
            return (float) (1.0E9d / this.f35600a.a());
        }
        return -1.0f;
    }

    public final int c() {
        return this.f35604e;
    }

    public final long d() {
        return this.f35600a.d() ? this.f35600a.b() : C.TIME_UNSET;
    }

    public final boolean e() {
        return this.f35600a.d();
    }

    public final void f() {
        this.f35600a.e();
        this.f35601b.e();
        this.f35602c = false;
        this.f35603d = C.TIME_UNSET;
        this.f35604e = 0;
    }

    public final long a() {
        return this.f35600a.d() ? this.f35600a.a() : C.TIME_UNSET;
    }
}
