package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class D6 {
    public final String A00;
    public final boolean A01;

    public D6(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != D6.class) {
            return false;
        }
        D6 d6 = (D6) obj;
        return TextUtils.equals(this.A00, d6.A00) && this.A01 == d6.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        String str = this.A00;
        int prime = str == null ? 0 : str.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}
