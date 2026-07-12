package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzghy {
    public static final zzghy zza = new zzghy("ASSUME_AES_GCM");
    public static final zzghy zzb = new zzghy("ASSUME_XCHACHA20POLY1305");
    public static final zzghy zzc = new zzghy("ASSUME_CHACHA20POLY1305");
    public static final zzghy zzd = new zzghy("ASSUME_AES_CTR_HMAC");
    public static final zzghy zze = new zzghy("ASSUME_AES_EAX");
    public static final zzghy zzf = new zzghy("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzghy(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
