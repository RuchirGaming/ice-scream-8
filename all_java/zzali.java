package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzali {
    public final int zza;
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzali(int i2, String str, List list, byte[] bArr) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
