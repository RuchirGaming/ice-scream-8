package com.google.android.gms.internal.ads;

import com.ironsource.sdk.constants.a;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzdw {
    public static final zzdw zza = new zzdw(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdw(int i2, int i3, int i4) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzfs.zzG(i4) ? zzfs.zzl(i4, i3) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        return this.zzb == zzdwVar.zzb && this.zzc == zzdwVar.zzc && this.zzd == zzdwVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + a.i.f17749e;
    }
}
