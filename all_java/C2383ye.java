package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2383ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28583b;

    public C2383ye(String str) {
        this(str, null);
    }

    public String a() {
        return this.f28583b;
    }

    public String b() {
        return this.f28582a;
    }

    public C2383ye(String str, String str2) {
        this.f28582a = str;
        this.f28583b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f28582a;
        }
        return this.f28582a + str;
    }
}
