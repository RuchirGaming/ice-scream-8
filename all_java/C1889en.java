package com.yandex.metrica.impl.ob;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1889en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f26860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f26861c;

    public C1889en(String str, byte[] bArr, byte[] bArr2) {
        this.f26859a = str;
        this.f26860b = bArr;
        this.f26861c = bArr2;
    }

    public byte[] a(byte[] bArr) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f26860b, "AES");
        Cipher cipher = Cipher.getInstance(this.f26859a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f26861c));
        return cipher.doFinal(bArr);
    }

    public byte[] a(byte[] bArr, int i2, int i3) throws Throwable {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f26860b, "AES");
        Cipher cipher = Cipher.getInstance(this.f26859a);
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f26861c));
        return cipher.doFinal(bArr, i2, i3);
    }
}
