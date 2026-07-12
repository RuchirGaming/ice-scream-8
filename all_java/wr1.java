package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class wr1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36510f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36512h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f36519o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36505a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36506b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f36507c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36508d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36509e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36511g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36513i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36514j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36515k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36516l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36517m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36518n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f36520p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f36521q = false;

    public final void a(String[] strArr) {
        this.f36507c = new HashSet(Arrays.asList(strArr));
    }

    public final void b(String str) {
        this.f36505a = str;
    }

    public final void c(String str) {
        this.f36506b = str;
    }

    public final void d(String str) {
        this.f36508d = str;
    }

    public final float e() {
        return this.f36519o;
    }

    public final int f() {
        return this.f36518n;
    }

    public final int g() {
        return this.f36520p;
    }

    public final int h() {
        int i2 = this.f36516l;
        if (i2 == -1 && this.f36517m == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f36517m == 1 ? 2 : 0);
    }

    public final boolean i() {
        return this.f36513i;
    }

    public final boolean j() {
        return this.f36511g;
    }

    public final boolean k() {
        return this.f36514j == 1;
    }

    public final boolean l() {
        return this.f36515k == 1;
    }

    public final void m() {
        this.f36516l = 1;
    }

    public final void n() {
        this.f36517m = 1;
    }

    public final void o() {
        this.f36515k = 1;
    }

    public final int a(String str, String str2, Set<String> set, String str3) {
        int i2;
        if (this.f36505a.isEmpty() && this.f36506b.isEmpty() && this.f36507c.isEmpty() && this.f36508d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f36505a;
        if (str4.isEmpty()) {
            i2 = 0;
        } else {
            i2 = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f36506b;
        if (!str5.isEmpty() && i2 != -1) {
            i2 = str5.equals(str2) ? i2 + 2 : -1;
        }
        String str6 = this.f36508d;
        if (!str6.isEmpty() && i2 != -1) {
            i2 = str6.equals(str3) ? i2 + 4 : -1;
        }
        if (i2 == -1 || !set.containsAll(this.f36507c)) {
            return 0;
        }
        return (this.f36507c.size() * 4) + i2;
    }

    public final void b(int i2) {
        this.f36510f = i2;
        this.f36511g = true;
    }

    public final int c() {
        if (this.f36511g) {
            return this.f36510f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final String d() {
        return this.f36509e;
    }

    public final void d(int i2) {
        this.f36520p = i2;
    }

    public final boolean b() {
        return this.f36521q;
    }

    public final void c(int i2) {
        this.f36518n = i2;
    }

    public final void a(String str) {
        this.f36509e = lb.b(str);
    }

    public final int a() {
        if (this.f36513i) {
            return this.f36512h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final void a(int i2) {
        this.f36512h = i2;
        this.f36513i = true;
    }

    public final void a(float f2) {
        this.f36519o = f2;
    }

    public final void a(boolean z) {
        this.f36521q = z;
    }
}
