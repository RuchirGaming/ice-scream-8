package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzbpk {
    private static zzbpk zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbpk() {
    }

    public static zzbpk zza() {
        if (zza == null) {
            zza = new zzbpk();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpj
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                zzbdc.zza(context2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzah)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzcip) zzcbr.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcbp() { // from class: com.google.android.gms.internal.ads.zzbpi
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcbp
                        public final Object zza(Object obj) {
                            return zzcio.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbph(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str, bundle)));
                } catch (RemoteException | zzcbq | NullPointerException e2) {
                    zzcbn.zzl("#007 Could not call remote method.", e2);
                }
            }
        });
        thread.start();
        return thread;
    }
}
