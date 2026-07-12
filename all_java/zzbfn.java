package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzbfn {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzbfl zza() {
        return (zzbfl) zzb.get();
    }

    static zzbfm zzb() {
        return (zzbfm) zzc.get();
    }

    public static void zzc(zzbfl zzbflVar) {
        zzb.set(zzbflVar);
    }
}
