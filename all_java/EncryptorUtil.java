package com.bytedance.applog.encryptor;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class EncryptorUtil {
    private static native byte[] ttEncrypt(byte[] bArr, int i2);

    static {
        try {
            System.loadLibrary("EncryptorP");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static byte[] encrypt(byte[] bArr, int i2) {
        if (bArr != null && i2 > 0) {
            try {
                if (bArr.length == i2) {
                    return ttEncrypt(bArr, i2);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
