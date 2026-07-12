package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzpf extends RuntimeException {
    public static <T> T zza(zzpi<T> zzpiVar) {
        try {
            return zzpiVar.zza();
        } catch (Exception e2) {
            throw new zzpf(e2);
        }
    }

    public zzpf(String str) {
        super(str);
    }

    private zzpf(Throwable th) {
        super(th);
    }
}
