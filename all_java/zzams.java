package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.sdk.constants.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzams {
    private final String zza;
    private final String zzb;

    public zzams(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzams zzamsVar = (zzams) obj;
            if (TextUtils.equals(this.zza, zzamsVar.zza) && TextUtils.equals(this.zzb, zzamsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + a.i.f17749e;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
