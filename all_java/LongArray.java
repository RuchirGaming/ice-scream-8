package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public LongArray(int i2) {
        this.values = new long[i2];
    }

    public final void add(long j2) {
        int i2 = this.size;
        long[] jArr = this.values;
        if (i2 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.values;
        int i3 = this.size;
        this.size = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long get(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.size);
        }
        return this.values[i2];
    }

    public final int size() {
        return this.size;
    }

    public final long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }
}
