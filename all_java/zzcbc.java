package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzcbc {
    public static final ThreadPoolExecutor zza = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zzcbb("ClientDefault"));
    public static final ExecutorService zzb = Executors.newSingleThreadExecutor(new zzcbb("ClientSingle"));
}
