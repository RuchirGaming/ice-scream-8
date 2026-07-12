package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgjq {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgjq(Map map, Map map2, zzgjp zzgjpVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgjo zza() {
        return new zzgjo(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(String.valueOf(obj))));
    }

    public final Object zzc(Enum r3) throws GeneralSecurityException {
        Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(String.valueOf(r3))));
    }
}
