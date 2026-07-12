package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public abstract class zzfwj {
    private static final zzfwj zza = new zzfwg();
    private static final zzfwj zzb = new zzfwh(-1);
    private static final zzfwj zzc = new zzfwh(1);

    /* synthetic */ zzfwj(zzfwi zzfwiVar) {
    }

    public static zzfwj zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfwj zzb(int i2, int i3);

    public abstract zzfwj zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfwj zzd(boolean z, boolean z2);

    public abstract zzfwj zze(boolean z, boolean z2);
}
