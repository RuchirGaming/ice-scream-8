package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum EnumC2088mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27629a;

    EnumC2088mn(int i2) {
        this.f27629a = i2;
    }

    public int a() {
        return this.f27629a;
    }

    public static EnumC2088mn a(Integer num) {
        if (num != null) {
            EnumC2088mn[] enumC2088mnArrValues = values();
            for (int i2 = 0; i2 < 3; i2++) {
                EnumC2088mn enumC2088mn = enumC2088mnArrValues[i2];
                if (enumC2088mn.f27629a == num.intValue()) {
                    return enumC2088mn;
                }
            }
        }
        return NONE;
    }
}
