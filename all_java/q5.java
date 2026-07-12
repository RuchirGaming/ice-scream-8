package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class q5 {
    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append(com.ironsource.sdk.constants.a.i.f17747c);
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append(com.ironsource.sdk.constants.a.i.f17746b);
            sb.append(Uri.encode((String) entry.getValue()));
            if (sb.length() > 61440) {
                p01.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return map2;
            }
            map2.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map2;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            p01.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
