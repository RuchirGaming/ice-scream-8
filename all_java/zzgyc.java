package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgyc {
    private static final zzgyb zza;
    private static final zzgyb zzb;

    static {
        zzgyb zzgybVar;
        try {
            zzgybVar = (zzgyb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgybVar = null;
        }
        zza = zzgybVar;
        zzb = new zzgyb();
    }

    static zzgyb zza() {
        return zza;
    }

    static zzgyb zzb() {
        return zzb;
    }
}
