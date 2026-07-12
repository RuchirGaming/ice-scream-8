package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum zzgzw {
    DOUBLE(zzgzx.DOUBLE, 1),
    FLOAT(zzgzx.FLOAT, 5),
    INT64(zzgzx.LONG, 0),
    UINT64(zzgzx.LONG, 0),
    INT32(zzgzx.INT, 0),
    FIXED64(zzgzx.LONG, 1),
    FIXED32(zzgzx.INT, 5),
    BOOL(zzgzx.BOOLEAN, 0),
    STRING(zzgzx.STRING, 2),
    GROUP(zzgzx.MESSAGE, 3),
    MESSAGE(zzgzx.MESSAGE, 2),
    BYTES(zzgzx.BYTE_STRING, 2),
    UINT32(zzgzx.INT, 0),
    ENUM(zzgzx.ENUM, 0),
    SFIXED32(zzgzx.INT, 5),
    SFIXED64(zzgzx.LONG, 1),
    SINT32(zzgzx.INT, 0),
    SINT64(zzgzx.LONG, 0);

    private final zzgzx zzt;

    zzgzw(zzgzx zzgzxVar, int i2) {
        this.zzt = zzgzxVar;
    }

    public final zzgzx zza() {
        return this.zzt;
    }
}
