package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25363a;

    N0(int i2) {
        this.f25363a = i2;
    }

    public static N0 a(Integer num) {
        if (num != null) {
            N0[] n0ArrValues = values();
            for (int i2 = 0; i2 < 3; i2++) {
                N0 n0 = n0ArrValues[i2];
                if (n0.f25363a == num.intValue()) {
                    return n0;
                }
            }
        }
        return UNKNOWN;
    }
}
