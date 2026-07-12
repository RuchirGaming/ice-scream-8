package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final /* synthetic */ class nf0 {
    public static int a(String str) {
        for (int i2 : q6.b(2)) {
            if (a(i2).equals(str)) {
                return i2;
            }
        }
        return 0;
    }

    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "streaming";
        }
        if (i2 == 2) {
            return "progressive";
        }
        throw null;
    }
}
