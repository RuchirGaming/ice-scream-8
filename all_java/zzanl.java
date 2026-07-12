package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzanl {
    public static final boolean zza = zzanm.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzanl() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzanm.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j2) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzank(str, j2, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j2;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j2 = 0;
        } else {
            long j3 = ((zzank) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j2 = ((zzank) list.get(list.size() - 1)).zzc - j3;
        }
        if (j2 > 0) {
            long j4 = ((zzank) this.zzb.get(0)).zzc;
            zzanm.zza("(%-4d ms) %s", Long.valueOf(j2), str);
            for (zzank zzankVar : this.zzb) {
                long j5 = zzankVar.zzc;
                zzanm.zza("(+%-4d) [%2d] %s", Long.valueOf(j5 - j4), Long.valueOf(zzankVar.zzb), zzankVar.zza);
                j4 = j5;
            }
        }
    }
}
