package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1457Zd implements C2L {
    public final SharedPreferences.Editor A00;

    public C1457Zd(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1457Zd A00(String str, long j2) {
        this.A00.putLong(str, j2);
        return this;
    }

    public final C1457Zd A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
