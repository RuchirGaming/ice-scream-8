package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ri1 {
    static {
        Pattern.compile("maps.yandex");
    }

    public static boolean a(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            String strReplaceFirst = str.replaceFirst("http(s?)://", "");
            int[] iArrB = q6.b(27);
            int length = iArrB.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (strReplaceFirst.startsWith(qi1.a(iArrB[i2]))) {
                    z = true;
                    break;
                }
                i2++;
            }
        } else {
            z = false;
            break;
        }
        return !z && URLUtil.isNetworkUrl(str);
    }

    public static boolean b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strReplaceFirst = str.replaceFirst("http(s?)://", "");
            int[] iArr = {10, 11, 13, 14};
            for (int i2 = 0; i2 < 4; i2++) {
                if (strReplaceFirst.startsWith(qi1.a(iArr[i2]))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(String str) {
        try {
            new URI(str);
            return !TextUtils.isEmpty(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
