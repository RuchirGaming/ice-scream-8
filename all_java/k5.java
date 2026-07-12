package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f32162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f32163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f32164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f32167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f32168k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f32172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f32173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f32174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f32175g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f32176h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f32177i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f32178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f32179k;

        public a(String str) {
            this.f32169a = str;
        }

        public final a a(String str) {
            this.f32170b = str;
            return this;
        }

        public final a b(String str) {
            this.f32176h = str;
            return this;
        }

        public final a c(String str) {
            this.f32173e = str;
            return this;
        }

        public final a d(String str) {
            this.f32171c = str;
            return this;
        }

        public final a a(List<String> list) {
            this.f32174f = list;
            return this;
        }

        public final a b() {
            this.f32177i = null;
            return this;
        }

        public final a a(Location location) {
            this.f32172d = location;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f32175g = map;
            return this;
        }

        public final a a(int i2) {
            this.f32178j = i2;
            return this;
        }

        public final a a(boolean z) {
            this.f32179k = z;
            return this;
        }

        public final k5 a() {
            return new k5(this, 0);
        }
    }

    /* synthetic */ k5(a aVar, int i2) {
        this(aVar);
    }

    public final String a() {
        return this.f32158a;
    }

    public final String b() {
        return this.f32159b;
    }

    public final String c() {
        return this.f32165h;
    }

    public final String d() {
        return this.f32161d;
    }

    public final List<String> e() {
        return this.f32162e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k5.class != obj.getClass()) {
            return false;
        }
        k5 k5Var = (k5) obj;
        if (!Objects.equals(this.f32158a, k5Var.f32158a)) {
            return false;
        }
        String str = this.f32159b;
        if (str == null ? k5Var.f32159b != null : !str.equals(k5Var.f32159b)) {
            return false;
        }
        String str2 = this.f32160c;
        if (str2 == null ? k5Var.f32160c != null : !str2.equals(k5Var.f32160c)) {
            return false;
        }
        String str3 = this.f32161d;
        if (str3 == null ? k5Var.f32161d != null : !str3.equals(k5Var.f32161d)) {
            return false;
        }
        List<String> list = this.f32162e;
        if (list == null ? k5Var.f32162e != null : !list.equals(k5Var.f32162e)) {
            return false;
        }
        Location location = this.f32163f;
        if (location == null ? k5Var.f32163f != null : !location.equals(k5Var.f32163f)) {
            return false;
        }
        Map<String, String> map = this.f32164g;
        if (map == null ? k5Var.f32164g != null : !map.equals(k5Var.f32164g)) {
            return false;
        }
        String str4 = this.f32165h;
        if (str4 == null ? k5Var.f32165h == null : str4.equals(k5Var.f32165h)) {
            return this.f32168k == k5Var.f32168k && this.f32167j == k5Var.f32167j;
        }
        return false;
    }

    public final String f() {
        return this.f32160c;
    }

    public final Location g() {
        return this.f32163f;
    }

    public final Map<String, String> h() {
        return this.f32164g;
    }

    public final int hashCode() {
        String str = this.f32159b;
        int iA = y2.a(this.f32158a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f32160c;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32161d;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f32162e;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f32163f;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map<String, String> map = this.f32164g;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f32165h;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        int i2 = this.f32167j;
        return iHashCode6 + (i2 != 0 ? q6.a(i2) : 0);
    }

    public final int i() {
        return this.f32167j;
    }

    public final String j() {
        return this.f32166i;
    }

    public final boolean k() {
        return this.f32168k;
    }

    private k5(a aVar) {
        this.f32158a = aVar.f32169a;
        this.f32159b = aVar.f32170b;
        this.f32160c = aVar.f32171c;
        this.f32161d = aVar.f32173e;
        this.f32162e = aVar.f32174f;
        this.f32163f = aVar.f32172d;
        this.f32164g = aVar.f32175g;
        this.f32165h = aVar.f32176h;
        this.f32166i = aVar.f32177i;
        this.f32167j = aVar.f32178j;
        this.f32168k = aVar.f32179k;
    }
}
