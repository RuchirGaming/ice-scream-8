package io.bidmachine.utils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public enum Gender {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);

    private final String ortbValue;
    private final int serverValue;

    Gender(String str, int i2) {
        this.ortbValue = str;
        this.serverValue = i2;
    }

    public String getOrtbValue() {
        return this.ortbValue;
    }

    public int getServerValue() {
        return this.serverValue;
    }

    public static Gender fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return Omitted;
        }
        if (iIntValue == 1) {
            return Female;
        }
        if (iIntValue != 2) {
            return null;
        }
        return Male;
    }
}
