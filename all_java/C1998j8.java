package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1998j8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C1998j8 f27165c = new C1998j8(new J7());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J7 f27166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f27167b = a.BLANK;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j8$a */
    private enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    C1998j8(J7 j7) {
        this.f27166a = j7;
    }

    public static C1998j8 a() {
        return f27165c;
    }

    public synchronized boolean b() {
        a aVar = this.f27167b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            this.f27166a.getClass();
            System.loadLibrary("appmetrica-service-native");
            this.f27167b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.f27167b = a.LOADING_ERROR;
            return false;
        }
    }
}
