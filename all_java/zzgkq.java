package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgkq {
    private static final zzgkq zza = new zzgkq();
    private final Map zzb = new HashMap();

    zzgkq() {
    }

    public static zzgkq zzb() {
        return zza;
    }

    public final synchronized zzgdd zza(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgdd) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgdd zzgddVar) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzgddVar);
            return;
        }
        if (((zzgdd) this.zzb.get(str)).equals(zzgddVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzgddVar));
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgdd) entry.getValue());
        }
    }
}
