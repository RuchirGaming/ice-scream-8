package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.sdk.constants.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzesm implements zzeux {
    public final Bundle zza;

    public zzesm(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = zzffc.zza(bundle, a.h.G);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(a.h.G, bundleZza);
    }
}
