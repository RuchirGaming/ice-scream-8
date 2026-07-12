package com.yandex.metrica.impl.ob;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class C1815c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26641a = new Object();

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e2);
        }
    }
}
