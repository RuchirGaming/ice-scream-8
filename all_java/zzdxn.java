package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzdxn extends Exception {
    private final int zza;

    public zzdxn(int i2) {
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdxn(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzdxn(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
