package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class xo1 {
    xo1() {
    }

    static String a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }
}
