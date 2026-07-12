package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzcay {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public final synchronized String zza() {
        String string;
        string = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = string;
        return string;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
