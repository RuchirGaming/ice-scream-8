package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class EnumC06161a {
    public static byte[] A01;
    public static final /* synthetic */ EnumC06161a[] A02;
    public static final EnumC06161a A03;
    public static final EnumC06161a A04;
    public static final EnumC06161a A05;
    public final String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        EnumC06161a enumC06161a = new EnumC06161a(strA01, 0, strA01);
        A05 = enumC06161a;
        String strA02 = A01(13, 14, 115);
        EnumC06161a enumC06161a2 = new EnumC06161a(strA02, 1, strA02);
        A04 = enumC06161a2;
        String strA03 = A01(0, 13, 126);
        EnumC06161a enumC06161a3 = new EnumC06161a(strA03, 2, strA03);
        A03 = enumC06161a3;
        A02 = new EnumC06161a[]{enumC06161a, enumC06161a2, enumC06161a3};
    }

    public EnumC06161a(String str, int i2, String str2) {
        super(str, i2);
        this.A00 = str2;
    }

    public static EnumC06161a A00(String str) {
        for (EnumC06161a enumC06161a : values()) {
            if (enumC06161a.A00.equalsIgnoreCase(str)) {
                return enumC06161a;
            }
        }
        return A03;
    }

    public static EnumC06161a valueOf(String str) {
        return (EnumC06161a) Enum.valueOf(EnumC06161a.class, str);
    }

    public static EnumC06161a[] values() {
        return (EnumC06161a[]) A02.clone();
    }
}
