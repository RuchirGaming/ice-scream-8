package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class AB {
    public static final AB A04 = new AA().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AB(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AB ab = (AB) obj;
        return this.A01 == ab.A01 && this.A02 == ab.A02 && this.A03 == ab.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = ((((17 * 31) + result) * 31) + this.A02) * 31;
        int result3 = this.A03;
        return result2 + result3;
    }
}
