package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.sdk.constants.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzeqs implements zzeux {
    public final double zza;
    public final boolean zzb;

    public zzeqs(double d2, boolean z) {
        this.zza = d2;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzffc.zza(bundle, a.h.G);
        bundle.putBundle(a.h.G, bundleZza);
        Bundle bundleZza2 = zzffc.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble("battery_level", this.zza);
    }
}
