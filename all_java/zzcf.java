package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzcf extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzcf(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.zza = z;
        this.zzb = i2;
    }

    public static zzcf zza(String str, Throwable th) {
        return new zzcf(str, th, true, 1);
    }

    public static zzcf zzb(String str, Throwable th) {
        return new zzcf(str, th, true, 0);
    }

    public static zzcf zzc(String str) {
        return new zzcf(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
