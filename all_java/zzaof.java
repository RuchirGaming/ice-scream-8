package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzaof implements zzanv {
    final /* synthetic */ Context zza;
    private File zzb = null;

    zzaof(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
