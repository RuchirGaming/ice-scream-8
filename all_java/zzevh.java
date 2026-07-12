package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.environment.globaldata.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzevh implements zzeux {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzevh(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzffc.zzf(bundle, a.s0, this.zza, !TextUtils.isEmpty(this.zza));
        int i2 = this.zzb;
        zzffc.zze(bundle, "cnt", i2, i2 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = zzffc.zza(bundle, com.ironsource.sdk.constants.a.h.G);
        bundle.putBundle(com.ironsource.sdk.constants.a.h.G, bundleZza);
        Bundle bundleZza2 = zzffc.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
