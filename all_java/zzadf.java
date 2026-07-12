package com.google.android.gms.internal.ads;

import com.ironsource.sdk.constants.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzadf {
    public static final zzadf zza = new zzadf(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadf(long j2, long j3) {
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadf zzadfVar = (zzadf) obj;
            if (this.zzb == zzadfVar.zzb && this.zzc == zzadfVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + a.i.f17749e;
    }
}
