package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzeuk implements zzeux {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzeuk(String str, String str2, String str3, String str4, Long l2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l2;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzffc.zzc(bundle, "gmp_app_id", this.zza);
        zzffc.zzc(bundle, "fbs_aiid", this.zzb);
        zzffc.zzc(bundle, "fbs_aeid", this.zzc);
        zzffc.zzc(bundle, "apm_id_origin", this.zzd);
        Long l2 = this.zze;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }
}
