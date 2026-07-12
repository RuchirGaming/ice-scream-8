package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class r {
    private long[] ack;
    private int oW;

    public r() {
        this(32);
    }

    public r(int i2) {
        this.ack = new long[i2];
    }

    public void bo(long j2) {
        int i2 = this.oW;
        long[] jArr = this.ack;
        if (i2 == jArr.length) {
            this.ack = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.ack;
        int i3 = this.oW;
        this.oW = i3 + 1;
        jArr2[i3] = j2;
    }

    public long fu(int i2) {
        if (i2 < 0 || i2 >= this.oW) {
            throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.oW);
        }
        return this.ack[i2];
    }

    public int size() {
        return this.oW;
    }

    public long[] pa() {
        return Arrays.copyOf(this.ack, this.oW);
    }
}
