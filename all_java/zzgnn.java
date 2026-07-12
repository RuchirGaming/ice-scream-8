package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgnn {
    public static final zzgnn zza = new zzgnn("SHA1");
    public static final zzgnn zzb = new zzgnn("SHA224");
    public static final zzgnn zzc = new zzgnn("SHA256");
    public static final zzgnn zzd = new zzgnn("SHA384");
    public static final zzgnn zze = new zzgnn("SHA512");
    private final String zzf;

    private zzgnn(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
