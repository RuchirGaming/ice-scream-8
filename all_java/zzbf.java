package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzbf {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final zzbf zza(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.zza.size()) {
            double dDoubleValue = ((Double) this.zzc.get(i2)).doubleValue();
            double dDoubleValue2 = ((Double) this.zzb.get(i2)).doubleValue();
            if (d2 < dDoubleValue || (dDoubleValue == d2 && d3 < dDoubleValue2)) {
                break;
            }
            i2++;
        }
        this.zza.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d2));
        this.zzb.add(i2, Double.valueOf(d3));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}
