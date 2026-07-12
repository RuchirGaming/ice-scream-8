package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzka {
    private static final zzjz zza;
    private static final zzjz zzb;

    static {
        zzjz zzjzVar;
        try {
            zzjzVar = (zzjz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjzVar = null;
        }
        zza = zzjzVar;
        zzb = new zzjz();
    }

    static zzjz zza() {
        return zza;
    }

    static zzjz zzb() {
        return zzb;
    }
}
