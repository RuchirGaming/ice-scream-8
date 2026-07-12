package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzyj {
    private final Handler zza;
    private final zzyl zzb;
    private boolean zzc;

    public zzyj(Handler handler, zzyl zzylVar) {
        this.zza = handler;
        this.zzb = zzylVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}
