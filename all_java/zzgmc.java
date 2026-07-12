package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgmc extends RuntimeException {
    public zzgmc(String str) {
        super(str);
    }

    public static Object zza(zzgmb zzgmbVar) {
        try {
            return zzgmbVar.zza();
        } catch (Exception e2) {
            throw new zzgmc(e2);
        }
    }

    public zzgmc(String str, Throwable th) {
        super(str, th);
    }

    public zzgmc(Throwable th) {
        super(th);
    }
}
