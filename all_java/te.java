package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class te {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str.getBytes(), 0), C.UTF8_NAME);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 0), C.UTF8_NAME);
        } catch (Exception unused) {
            return new String(bArr);
        }
    }
}
