package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class GE {
    public final int A00;
    public final int A01;
    public final String A02;

    public GE(int i2, int i3, String str) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GE ge = (GE) obj;
        if (this.A00 == ge.A00 && this.A01 == ge.A01 && TextUtils.equals(this.A02, ge.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i2 = result * 31;
        int result2 = this.A01;
        int result3 = (i2 + result2) * 31;
        String str = this.A02;
        int result4 = str != null ? str.hashCode() : 0;
        return result3 + result4;
    }
}
