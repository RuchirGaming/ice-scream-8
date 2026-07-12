package com.yandex.mobile.ads.impl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f31877c;

    public j9(String str, byte[] bArr, byte[] bArr2) {
        this.f31875a = str;
        this.f31876b = bArr;
        this.f31877c = bArr2;
    }

    public final byte[] a(byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f31876b, "AES");
        Cipher cipher = Cipher.getInstance(this.f31875a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f31877c));
        return cipher.doFinal(bArr);
    }
}
