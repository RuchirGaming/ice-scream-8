package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfpq extends Exception {
    private final int zza;

    public zzfpq(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfpq(int i2, Throwable th) {
        super(th);
        this.zza = i2;
    }
}
