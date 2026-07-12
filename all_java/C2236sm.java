package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class C2236sm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28112c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28114b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2236sm(long j2, int i2) {
        this.f28113a = j2;
        this.f28114b = i2;
    }

    public final int a() {
        return this.f28114b;
    }

    public final long b() {
        return this.f28113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2236sm)) {
            return false;
        }
        C2236sm c2236sm = (C2236sm) obj;
        return this.f28113a == c2236sm.f28113a && this.f28114b == c2236sm.f28114b;
    }

    public int hashCode() {
        long j2 = this.f28113a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f28114b;
    }

    public String toString() {
        return "DecimalProtoModel(mantissa=" + this.f28113a + ", exponent=" + this.f28114b + ")";
    }
}
