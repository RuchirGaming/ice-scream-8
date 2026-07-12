package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzata extends zzaqs {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzata() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzata(String str) {
        HashMap mapZza = zza(str);
        if (mapZza != null) {
            this.zza = (Long) mapZza.get(0);
            this.zzb = (Boolean) mapZza.get(1);
            this.zzc = (Boolean) mapZza.get(2);
        }
    }
}
