package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzflp {
    private final String zza;
    private final String zzb;

    private zzflp(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzflp zza(String str, String str2) {
        zzfmv.zza(str, "Name is null or empty");
        zzfmv.zza(str2, "Version is null or empty");
        return new zzflp(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
