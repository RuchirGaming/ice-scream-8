package com.unity3d.services.ads.gmascar.managers;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public static ScarBiddingManagerType fromName(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != 99470) {
            if (iHashCode == 100171 && str.equals("eag")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (str.equals("dis")) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return EAGER;
        }
        return DISABLED;
    }

    private static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }
}
