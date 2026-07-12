package com.unity3d.services.analytics;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public enum AcquisitionType {
    SOFT,
    PREMIUM;

    /* JADX INFO: renamed from: com.unity3d.services.analytics.AcquisitionType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$analytics$AcquisitionType;

        static {
            int[] iArr = new int[AcquisitionType.values().length];
            $SwitchMap$com$unity3d$services$analytics$AcquisitionType = iArr;
            try {
                iArr[AcquisitionType.SOFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$analytics$AcquisitionType[AcquisitionType.PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$unity3d$services$analytics$AcquisitionType[ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? "" : "premium";
        }
        return "soft";
    }
}
