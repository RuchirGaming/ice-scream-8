package com.yandex.mobile.ads.impl;

import android.util.Base64;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ue {
    public static String a(String str) {
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
