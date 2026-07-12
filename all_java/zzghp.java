package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzghp extends zzgdv {
    private final String zza;

    private zzghp(String str) {
        this.zza = str;
    }

    public static zzghp zzb(String str) throws GeneralSecurityException {
        return new zzghp(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzghp) {
            return ((zzghp) obj).zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzghp.class, this.zza});
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return false;
    }

    public final String zzc() {
        return this.zza;
    }
}
