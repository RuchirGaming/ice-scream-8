package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzddv {
    protected final Map zza = new HashMap();

    protected zzddv(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzdfw zzdfwVar) {
        zzo(zzdfwVar.zza, zzdfwVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzdfw) it.next());
        }
    }

    protected final synchronized void zzt(final zzddu zzdduVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddt
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdduVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
