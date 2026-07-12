package com.bytedance.sdk.component.embedapplog;

import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PangleEncryptUtils {
    private static native byte[] ttDecrypt(byte[] bArr, int i2);

    private static native byte[] ttEncrypt(byte[] bArr, int i2);

    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e2) {
            Log.e("pangle-encrypt", e2.getMessage());
        }
    }

    public static byte[] encrypt(byte[] bArr, int i2) {
        try {
            return ttEncrypt(bArr, i2);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, int i2) {
        try {
            return ttDecrypt(bArr, i2);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return null;
        }
    }
}
