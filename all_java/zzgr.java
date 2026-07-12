package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzgr extends IOException {
    public final int zza;

    public zzgr(int i2) {
        this.zza = i2;
    }

    public zzgr(String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzgr(String str, Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzgr(Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}
