package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzjz {
    zzjz() {
    }

    public static final boolean zza(Object obj) {
        return !((zzjy) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzjy zzjyVarZzb = (zzjy) obj;
        zzjy zzjyVar = (zzjy) obj2;
        if (!zzjyVar.isEmpty()) {
            if (!zzjyVarZzb.zze()) {
                zzjyVarZzb = zzjyVarZzb.zzb();
            }
            zzjyVarZzb.zzd(zzjyVar);
        }
        return zzjyVarZzb;
    }
}
