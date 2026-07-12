package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public enum zzaey {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");

    private final String zzd;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }

    zzaey(String str) {
        this.zzd = str;
    }
}
