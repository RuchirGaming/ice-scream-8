package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzeol implements zzeux {
    private final boolean zza;

    public zzeol(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
    }
}
