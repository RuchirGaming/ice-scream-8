package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public enum EnumC1076Kg {
    A06(0),
    A0F(1),
    A07(2),
    A0G(3),
    A08(4),
    A05(5),
    A0D(6),
    A0E(7),
    A0J(8),
    A0C(9),
    A09(10),
    A0H(11),
    A0I(16),
    A0B(17),
    A0A(18);

    public static byte[] A01;
    public static final EnumC1076Kg[] A02;
    public static final String A03;
    public final int A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-77, -74, -47, -75, -70, -63, -69, -75, -73, -59, -115, -100, -100, -85, -115, -112, 98, 113, 113, -128, 98, 101, -128, 119, 83, -120, -105, -105, -90, -116, -107, -114, -120, -114, -116, -108, -116, -107, -101, -90, -120, -117, 112, 111, 124, 124, 115, -128, -115, -126, 125, -115, 119, 124, -126, 115, -128, -127, -126, 119, -126, 119, 111, 122, -68, -56, -69, -57, -53, -69, -60, -71, -49, -43, -71, -73, -58, -58, -65, -60, -67, 100, 112, 112, 108, 123, 104, 101, 106, 103, 111, 104, 109, 107, 104, 109, 100, 126, 117, 104, 99, 100, 110, 126, 96, 99, -73, -64, -52, -63, -65, -74, -76, -76, -78, -65, -122, -113, -101, -112, -114, -123, -125, -125, -127, -114, -101, -118, -117, -101, 125, -111, -112, -117, -101, -123, -119, -116, -101, -120, -117, -125, -125, -123, -118, -125, -110, -113, -108, -111, -91, -121, -118, -43, -46, -41, -44, -24, -54, -51, -24, -33, -69, -47, -60, -41, -52, -39, -56, -30, -58, -49, -46, -42, -56, -30, -59, -40, -41, -41, -46, -47, -72, -79, -84, -87, -84, -88, -89, -62, -81, -78, -86, -86, -84, -79, -86, -123, 120, 115, 116, 126, -114, 112, 115};
    }

    static {
        A03();
        EnumC1076Kg[] enumC1076KgArr = {A0G, A08, A05, A0E, A0H, A0I, A0B, A0A};
        A02 = enumC1076KgArr;
        JSONArray array = new JSONArray();
        for (EnumC1076Kg enumC1076Kg : enumC1076KgArr) {
            array.put(enumC1076Kg.A00());
        }
        A03 = array.toString();
    }

    EnumC1076Kg(int i2) {
        this.A00 = i2;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A03;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
