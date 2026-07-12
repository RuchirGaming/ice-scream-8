package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface zzfqr {
    ExecutorService zza(int i2);

    ExecutorService zzb(ThreadFactory threadFactory, int i2);

    ExecutorService zzc(int i2, ThreadFactory threadFactory, int i3);
}
