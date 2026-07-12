package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1R, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1R implements Serializable {
    public static byte[] A04 = null;
    public static String[] A05 = {DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "N8LJkoTRbuRbC1tJ", "jfJOiGRwPDVL1NrTNwB42KXE8H2UBngU", "vBF5X8psVmC8vN2i9Fb6pwYPcFw8P16Y", "MnzIPqWVO6BB6yg7oNwcPff6zueAQoos", "vMZUyoTb2kOawbdq3lii4zyBkGUB4gvd", "5yRYj6PaRtwfaNlpyi5ySSeMn9NdrDw4", "Ti3I"};
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 96;
            String[] strArr = A05;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "o";
            strArr2[1] = "Fs5WcDJhxaD3DdRX";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{34, 51, 51, 28, 42, 39, 46, Utf8.REPLACEMENT_BYTE, Base64.padSymbol, 53, Utf8.REPLACEMENT_BYTE, 57, 59, 1, 48, Utf8.REPLACEMENT_BYTE, 51, 59, 15, 24, 27, 24, 15, 15, 24, 15, 126, 105, 124, 99, 126, 120, 101, 98, 107, 83, 97, 99, 104, 105};
    }

    static {
        A05();
    }

    public C1R(String str, String str2, String str3, int i2) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i2;
    }

    public static C1R A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A04(0, 6, 35));
        String strOptString2 = jSONObject.optString(A04(18, 8, 29));
        String packageName = jSONObject.optString(A04(6, 12, 62));
        int iOptInt = jSONObject.optInt(A04(26, 14, 108), -1);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(packageName) || iOptInt == -1) {
            return null;
        }
        return new C1R(strOptString, strOptString2, packageName, iOptInt);
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C1R c1r, Context context) {
        if (c1r != null && c1r.A08()) {
            new C1329Uc(context).A01(true, c1r.A01(), c1r.A03(), c1r.A02(), System.currentTimeMillis());
        }
    }

    public static void A07(C1R c1r, Context context) {
        if (c1r != null && c1r.A09()) {
            new C1329Uc(context).A01(false, c1r.A01(), c1r.A03(), c1r.A02(), System.currentTimeMillis());
        }
    }

    private final boolean A08() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A09() {
        return (this.A00 & 1) != 0;
    }
}
