package com.google.android.gms.internal.ads;

import com.ironsource.sdk.constants.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzfwv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzfwv(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + a.i.f17746b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + a.i.f17746b + String.valueOf(obj));
    }
}
