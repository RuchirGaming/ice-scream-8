package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class C2047l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f27539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f27540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f27542f;

    public C2047l7(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f27537a = str;
        this.f27538b = str2;
        this.f27539c = num;
        this.f27540d = num2;
        this.f27541e = str3;
        this.f27542f = bool;
    }

    public final String a() {
        return this.f27537a;
    }

    public final Integer b() {
        return this.f27540d;
    }

    public final String c() {
        return this.f27538b;
    }

    public final Integer d() {
        return this.f27539c;
    }

    public final String e() {
        return this.f27541e;
    }

    public final Boolean f() {
        return this.f27542f;
    }

    public C2047l7(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
