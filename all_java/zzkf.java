package com.google.android.gms.internal.measurement;

import com.inmobi.commons.core.configs.TelemetryConfig;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public enum zzkf {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(TelemetryConfig.DEFAULT_SAMPLING_FACTOR)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzii.class, zzii.class, zzii.zza),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);

    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    public final Class<?> zza() {
        return this.zzm;
    }

    zzkf(Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }
}
