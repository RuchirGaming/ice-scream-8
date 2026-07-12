package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgkm {
    private static final zzgkm zza = new zzgkm();
    private final Map zzb = new HashMap();

    public static zzgkm zza() {
        return zza;
    }

    public final synchronized void zzb(zzgkl zzgklVar, Class cls) throws GeneralSecurityException {
        zzgkl zzgklVar2 = (zzgkl) this.zzb.get(cls);
        if (zzgklVar2 != null && !zzgklVar2.equals(zzgklVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zzgklVar);
    }
}
