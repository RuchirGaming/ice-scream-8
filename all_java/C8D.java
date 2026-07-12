package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8D, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C8D {
    public static byte[] A04;
    public static String[] A05 = {"MRuBx", "tnrUNtkj", "pjyIxrC6Yt5E7Bc8e3CsDS5x0xMg", "2xISKY0hJDtdJSu4Q6JXzE3xpGdbyGij", "ditV1dZQcpc", "LaRPF5Qegj7e827D6k5bX2o3j9w5", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "ieJW9hY3GIu"};
    public final String A00;
    public final String A01;
    public final Map<C8H, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23, -18, -27, -38, -69, -72, -78};
        String[] strArr = A05;
        if (strArr[2].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "sekG1ort6wl";
        strArr2[7] = "5zf1LSqUL7z";
        A04 = bArr;
    }

    static {
        A01();
    }

    public C8D(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        List<String> list;
        this.A00 = str;
        this.A01 = str2;
        this.A03 = jSONObject;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (C8H c8h : C8H.values()) {
            this.A02.put(c8h, new LinkedList());
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String trackerUrl = jSONObject2.getString(A00(0, 4, 108));
                String trackerTypeStr = jSONObject2.getString(A00(4, 3, 61));
                C8H c8hValueOf = C8H.valueOf(trackerUrl.toUpperCase(Locale.US));
                if (!TextUtils.isEmpty(trackerTypeStr) && (list = this.A02.get(c8hValueOf)) != null) {
                    list.add(trackerTypeStr);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String A02() {
        return this.A00;
    }

    public final List<String> A03(C8H c8h) {
        return this.A02.get(c8h);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
