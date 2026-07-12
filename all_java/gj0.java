package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31052b;

    public gj0(int i2, String str) {
        this(i2, str, 0);
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(this.f31051a, 0);
            if (bArrDecode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                secureRandom.nextBytes(bArr2);
                return a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
            }
        } catch (Throwable unused) {
            int i2 = ga0.f30971a;
        }
        return null;
    }

    private gj0(int i2, String str, int i3) {
        this.f31051a = str;
        this.f31052b = i2;
    }

    private byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream2.write(bArr2);
                byteArrayOutputStream2.write(bArr3);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream2.close();
                Cipher cipher = Cipher.getInstance(com.ironsource.mediationsdk.utils.i.f17216b);
                j9 j9Var = new j9("AES/CBC/PKCS5Padding", bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f31052b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(j9Var.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return byteArray2;
                } catch (Throwable unused2) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused4) {
            byteArrayOutputStream = null;
        }
    }
}
