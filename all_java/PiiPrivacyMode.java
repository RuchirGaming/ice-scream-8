package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public enum PiiPrivacyMode {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    public static PiiPrivacyMode getPiiPrivacyMode(String str) {
        if (str == null) {
            return NULL;
        }
        PiiPrivacyMode piiPrivacyMode = UNDEFINED;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return piiPrivacyMode;
        }
    }
}
