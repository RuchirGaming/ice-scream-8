package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.NativeAdImageApi;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class J4 implements NativeAdImageApi {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{85, 88, 84, 90, 85, 73, 92, 91, 69, 12, 18, 31, 15, 19};
    }

    public J4(String str, int i2, int i3) {
        this.A02 = str;
        this.A01 = i2;
        this.A00 = i3;
    }

    public static J4 A00(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(A01(6, 3, 51))) == null) {
            return null;
        }
        return new J4(strOptString, jSONObject.optInt(A01(9, 5, 97), 0), jSONObject.optInt(A01(0, 6, 39), 0));
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final String getUrl() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.NativeAdImageApi
    public final int getWidth() {
        return this.A01;
    }
}
