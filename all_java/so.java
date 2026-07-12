package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28116b;

    private so(uo<?> uoVar, boolean z, String str) {
        uoVar.getClass();
        this.f28115a = z;
        this.f28116b = str;
    }

    public final String a() {
        return this.f28116b;
    }

    public final boolean b() {
        return this.f28115a;
    }

    public static final so a(uo<?> uoVar) {
        return new so(uoVar, true, "");
    }

    public static final so a(uo<?> uoVar, String str) {
        return new so(uoVar, false, str);
    }
}
