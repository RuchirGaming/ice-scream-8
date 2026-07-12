package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzaeg extends zzafx {
    private final String zza;
    private final String zzb;

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafx
    final String zzb() {
        return this.zza;
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    zzaeg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzafx) {
            zzafx zzafxVar = (zzafx) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzafxVar.zzb()) : zzafxVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzafxVar.zza()) : zzafxVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }
}
