package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum I0 {
    NATIVE(0),
    JS(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25023a;

    I0(int i2) {
        this.f25023a = i2;
    }

    public static I0 a(int i2) {
        I0[] i0ArrValues = values();
        for (int i3 = 0; i3 < 2; i3++) {
            I0 i0 = i0ArrValues[i3];
            if (i0.f25023a == i2) {
                return i0;
            }
        }
        return NATIVE;
    }
}
