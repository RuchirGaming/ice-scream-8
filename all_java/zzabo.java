package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzabo {
    public static final zzabo zza = new zzabo(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzabo(int i2, long j2, long j3) {
        this.zzb = i2;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzabo zzd(long j2, long j3) {
        return new zzabo(-1, j2, j3);
    }

    public static zzabo zze(long j2) {
        return new zzabo(0, C.TIME_UNSET, j2);
    }

    public static zzabo zzf(long j2, long j3) {
        return new zzabo(-2, j2, j3);
    }
}
