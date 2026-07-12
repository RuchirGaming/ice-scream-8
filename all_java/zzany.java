package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzany {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzany(int i2, List list, int i3, InputStream inputStream) {
        this.zza = i2;
        this.zzb = list;
        this.zzc = i3;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final InputStream zzc() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zzb);
    }
}
