package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum EnumC1867e1 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26768a;

    EnumC1867e1(String str) {
        this.f26768a = str;
    }

    public String a() {
        return this.f26768a;
    }

    public static EnumC1867e1 a(String str) {
        EnumC1867e1[] enumC1867e1ArrValues = values();
        for (int i2 = 0; i2 < 6; i2++) {
            EnumC1867e1 enumC1867e1 = enumC1867e1ArrValues[i2];
            if (enumC1867e1.f26768a.equals(str)) {
                return enumC1867e1;
            }
        }
        return UNKNOWN;
    }
}
