package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzkl {
    private static final zzkk zza;
    private static final zzkk zzb;

    static {
        zzkk zzkkVar;
        try {
            zzkkVar = (zzkk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzkkVar = null;
        }
        zza = zzkkVar;
        zzb = new zzkk();
    }

    static zzkk zza() {
        return zza;
    }

    static zzkk zzb() {
        return zzb;
    }
}
