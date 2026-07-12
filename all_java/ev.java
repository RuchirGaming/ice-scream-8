package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<t01> f30557b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f30558c = Collections.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f30561f;

    public final String a() {
        return this.f30561f;
    }

    public final void b(String str) {
        this.f30556a = str;
    }

    public final Map<String, String> c() {
        return this.f30558c;
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f30559d = str;
        }
    }

    public final List<t01> e() {
        return this.f30557b;
    }

    public final synchronized String f() {
        return this.f30559d;
    }

    public final void a(String str) {
        this.f30561f = str;
    }

    public final String b() {
        return this.f30556a;
    }

    public final void c(String str) {
        this.f30560e = str;
    }

    public final String d() {
        return this.f30560e;
    }
}
