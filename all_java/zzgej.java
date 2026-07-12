package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgej {
    public static final zzgej zza = new zzgej("SHA1");
    public static final zzgej zzb = new zzgej("SHA224");
    public static final zzgej zzc = new zzgej("SHA256");
    public static final zzgej zzd = new zzgej("SHA384");
    public static final zzgej zze = new zzgej("SHA512");
    private final String zzf;

    private zzgej(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
