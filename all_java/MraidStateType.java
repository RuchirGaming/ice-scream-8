package com.amazon.device.ads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
enum MraidStateType {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    /* JADX INFO: renamed from: com.amazon.device.ads.MraidStateType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$MraidStateType[ordinal()];
        if (i2 == 1) {
            return "loading";
        }
        if (i2 == 2) {
            return "hidden";
        }
        if (i2 == 3) {
            return "default";
        }
        if (i2 != 4) {
            return i2 != 5 ? "" : "expanded";
        }
        return "resized";
    }
}
