package com.facebook.ads.redexgen.X;

import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public abstract class R4 {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ R4[] A02;
    public static final R4 A03;
    public static final R4 A04;
    public static final R4 A05;
    public static final R4 A06;
    public static final R4 A07;
    public static final R4 A08;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, 127, -92, -86, 101, 120, -128, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i2);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i2);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String strA02 = A02(0, 5, 105);
        final int i2 = 0;
        R4 r4 = new R4(strA02, i2) { // from class: com.facebook.ads.redexgen.X.HB
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i3) {
                return jSONArray.optJSONArray(i3) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return R5.A00(jSONArray.optJSONArray(i3), jSONArray2.optJSONArray(i3));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return R5.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = r4;
        final String strA03 = A02(5, 7, 40);
        final int i3 = 1;
        R4 r5 = new R4(strA03, i3) { // from class: com.facebook.ads.redexgen.X.H5
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i4) {
                return jSONArray.optBoolean(i4, true) == jSONArray.optBoolean(i4, false);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optBoolean(i4) == jSONArray2.optBoolean(i4);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = r5;
        final String strA04 = A02(12, 6, 81);
        final int i4 = 2;
        R4 r6 = new R4(strA04, i4) { // from class: com.facebook.ads.redexgen.X.H3
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, TelemetryConfig.DEFAULT_SAMPLING_FACTOR) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) != jSONArray.optDouble(i5, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optDouble(i5) == jSONArray2.optDouble(i5);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = r6;
        final String strA05 = A02(18, 3, 50);
        final int i5 = 3;
        R4 r7 = new R4(strA05, i5) { // from class: com.facebook.ads.redexgen.X.Gz
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i6) {
                return jSONArray.optInt(i6, 0) == jSONArray.optInt(i6, 1) && jSONArray.optDouble(i6, TelemetryConfig.DEFAULT_SAMPLING_FACTOR) == jSONArray.optDouble(i6, 1.0d) && ((double) jSONArray.optInt(i6, 0)) == jSONArray.optDouble(i6, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return jSONArray.optInt(i6) == jSONArray2.optInt(i6);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = r7;
        final String strA06 = A02(21, 6, 18);
        final int i6 = 4;
        R4 r8 = new R4(strA06, i6) { // from class: com.facebook.ads.redexgen.X.Gw
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i7) {
                return jSONArray.optJSONObject(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return R5.A02(jSONArray.optJSONObject(i7), jSONArray2.optJSONObject(i7));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return R5.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = r8;
        final String strA07 = A02(27, 6, 36);
        final int i7 = 5;
        R4 r9 = new R4(strA07, i7) { // from class: com.facebook.ads.redexgen.X.Gt
            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A04(JSONArray jSONArray, int i8) {
                return jSONArray.optString(i8) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i8) {
                return jSONArray.optString(i8).equals(jSONArray2.optString(i8));
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.R4
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = r9;
        A02 = new R4[]{r4, r5, r6, r7, r8, r9};
    }

    public R4(String str, int i2) {
        super(str, i2);
    }

    public static R4 A00(JSONArray jSONArray, int i2) {
        for (R4 type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i2)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static R4 A01(JSONObject jSONObject, String str) {
        for (R4 r4 : values()) {
            boolean zA06 = r4.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA06) {
                return r4;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static R4 valueOf(String str) {
        return (R4) Enum.valueOf(R4.class, str);
    }

    public static R4[] values() {
        return (R4[]) A02.clone();
    }
}
