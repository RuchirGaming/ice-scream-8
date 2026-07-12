package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class GP {
    public int A00;
    public final int A01;
    public final GO[] A02;

    public GP(GO... goArr) {
        this.A02 = goArr;
        this.A01 = goArr.length;
    }

    public final GO A00(int i2) {
        return this.A02[i2];
    }

    public final GO[] A01() {
        return (GO[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((GP) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
