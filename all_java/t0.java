package com.fyber.inneractive.sdk.util;

import com.amazon.aps.shared.util.APSSharedUtil;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class t0 {
    public static String a(String str, int i2) {
        if (i2 <= 0 || str.length() <= i2) {
            return str;
        }
        return str.substring(0, i2 - 3) + APSSharedUtil.TRUNCATE_SEPARATOR;
    }
}
