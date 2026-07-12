package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzda implements zzcv {
    @Override // com.google.android.gms.internal.measurement.zzcv
    public final Runnable zza(Runnable runnable) {
        return runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final <V> Callable<V> zza(Callable<V> callable) {
        return callable;
    }

    zzda() {
    }
}
