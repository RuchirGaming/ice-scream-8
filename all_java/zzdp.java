package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzdp implements zzdo {
    private static final zzdp zza = new zzdp(null);
    private final Object zzb;

    private zzdp(Object obj) {
        this.zzb = obj;
    }

    public static zzdo zza(Object obj) {
        Objects.requireNonNull(obj, "instance cannot be null");
        return new zzdp(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zzb() {
        return this.zzb;
    }
}
