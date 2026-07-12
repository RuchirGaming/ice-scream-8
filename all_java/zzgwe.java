package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum zzgwe {
    DOUBLE(0, 1, zzgxa.DOUBLE),
    FLOAT(1, 1, zzgxa.FLOAT),
    INT64(2, 1, zzgxa.LONG),
    UINT64(3, 1, zzgxa.LONG),
    INT32(4, 1, zzgxa.INT),
    FIXED64(5, 1, zzgxa.LONG),
    FIXED32(6, 1, zzgxa.INT),
    BOOL(7, 1, zzgxa.BOOLEAN),
    STRING(8, 1, zzgxa.STRING),
    MESSAGE(9, 1, zzgxa.MESSAGE),
    BYTES(10, 1, zzgxa.BYTE_STRING),
    UINT32(11, 1, zzgxa.INT),
    ENUM(12, 1, zzgxa.ENUM),
    SFIXED32(13, 1, zzgxa.INT),
    SFIXED64(14, 1, zzgxa.LONG),
    SINT32(15, 1, zzgxa.INT),
    SINT64(16, 1, zzgxa.LONG),
    GROUP(17, 1, zzgxa.MESSAGE),
    DOUBLE_LIST(18, 2, zzgxa.DOUBLE),
    FLOAT_LIST(19, 2, zzgxa.FLOAT),
    INT64_LIST(20, 2, zzgxa.LONG),
    UINT64_LIST(21, 2, zzgxa.LONG),
    INT32_LIST(22, 2, zzgxa.INT),
    FIXED64_LIST(23, 2, zzgxa.LONG),
    FIXED32_LIST(24, 2, zzgxa.INT),
    BOOL_LIST(25, 2, zzgxa.BOOLEAN),
    STRING_LIST(26, 2, zzgxa.STRING),
    MESSAGE_LIST(27, 2, zzgxa.MESSAGE),
    BYTES_LIST(28, 2, zzgxa.BYTE_STRING),
    UINT32_LIST(29, 2, zzgxa.INT),
    ENUM_LIST(30, 2, zzgxa.ENUM),
    SFIXED32_LIST(31, 2, zzgxa.INT),
    SFIXED64_LIST(32, 2, zzgxa.LONG),
    SINT32_LIST(33, 2, zzgxa.INT),
    SINT64_LIST(34, 2, zzgxa.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgxa.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgxa.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgxa.LONG),
    UINT64_LIST_PACKED(38, 3, zzgxa.LONG),
    INT32_LIST_PACKED(39, 3, zzgxa.INT),
    FIXED64_LIST_PACKED(40, 3, zzgxa.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgxa.INT),
    BOOL_LIST_PACKED(42, 3, zzgxa.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgxa.INT),
    ENUM_LIST_PACKED(44, 3, zzgxa.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgxa.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgxa.LONG),
    SINT32_LIST_PACKED(47, 3, zzgxa.INT),
    SINT64_LIST_PACKED(48, 3, zzgxa.LONG),
    GROUP_LIST(49, 2, zzgxa.MESSAGE),
    MAP(50, 4, zzgxa.VOID);

    private static final zzgwe[] zzZ;
    private final zzgxa zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzgwe[] zzgweVarArrValues = values();
        zzZ = new zzgwe[zzgweVarArrValues.length];
        for (zzgwe zzgweVar : zzgweVarArrValues) {
            zzZ[zzgweVar.zzac] = zzgweVar;
        }
    }

    zzgwe(int i2, int i3, zzgxa zzgxaVar) {
        this.zzac = i2;
        this.zzab = zzgxaVar;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            this.zzad = zzgxaVar.zza();
        } else {
            this.zzad = null;
        }
        if (i3 == 1) {
            zzgxa zzgxaVar2 = zzgxa.VOID;
            zzgxaVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
