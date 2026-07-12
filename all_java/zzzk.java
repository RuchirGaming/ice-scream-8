package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzzk {
    private static Constructor zza;
    private static Method zzb;
    private static Method zzc;

    public static zzae zza(float f2) {
        try {
            if (zza == null || zzb == null || zzc == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                zza = cls.getConstructor(new Class[0]);
                zzb = cls.getMethod("setRotationDegrees", Float.TYPE);
                zzc = cls.getMethod("build", new Class[0]);
            }
            Object objNewInstance = zza.newInstance(new Object[0]);
            zzb.invoke(objNewInstance, Float.valueOf(f2));
            Object objInvoke = zzc.invoke(objNewInstance, new Object[0]);
            Objects.requireNonNull(objInvoke);
            return (zzae) objInvoke;
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }
}
