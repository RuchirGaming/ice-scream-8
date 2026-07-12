package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class af<V> {
    private int acR;
    private int oW;
    private V[] pJ;
    private long[] zI;

    public af() {
        this(10);
    }

    public af(int i2) {
        this.zI = new long[i2];
        this.pJ = (V[]) newArray(i2);
    }

    public synchronized void a(long j2, V v) {
        bq(j2);
        pR();
        b(j2, v);
    }

    public synchronized void clear() {
        this.acR = 0;
        this.oW = 0;
        Arrays.fill(this.pJ, (Object) null);
    }

    public synchronized int size() {
        return this.oW;
    }

    public synchronized V pollFirst() {
        return this.oW == 0 ? null : pQ();
    }

    public synchronized V bp(long j2) {
        return g(j2, true);
    }

    private V g(long j2, boolean z) {
        V vPQ = null;
        long j3 = Long.MAX_VALUE;
        while (this.oW > 0) {
            long j4 = j2 - this.zI[this.acR];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            vPQ = pQ();
            j3 = j4;
        }
        return vPQ;
    }

    private V pQ() {
        a.checkState(this.oW > 0);
        V[] vArr = this.pJ;
        int i2 = this.acR;
        V v = vArr[i2];
        vArr[i2] = null;
        this.acR = (i2 + 1) % vArr.length;
        this.oW--;
        return v;
    }

    private void bq(long j2) {
        int i2 = this.oW;
        if (i2 > 0) {
            if (j2 <= this.zI[((this.acR + i2) - 1) % this.pJ.length]) {
                clear();
            }
        }
    }

    private void pR() {
        int length = this.pJ.length;
        if (this.oW < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) newArray(i2);
        int i3 = this.acR;
        int i4 = length - i3;
        System.arraycopy(this.zI, i3, jArr, 0, i4);
        System.arraycopy(this.pJ, this.acR, vArr, 0, i4);
        int i5 = this.acR;
        if (i5 > 0) {
            System.arraycopy(this.zI, 0, jArr, i4, i5);
            System.arraycopy(this.pJ, 0, vArr, i4, this.acR);
        }
        this.zI = jArr;
        this.pJ = vArr;
        this.acR = 0;
    }

    private void b(long j2, V v) {
        int i2 = this.acR;
        int i3 = this.oW;
        V[] vArr = this.pJ;
        int length = (i2 + i3) % vArr.length;
        this.zI[length] = j2;
        vArr[length] = v;
        this.oW = i3 + 1;
    }

    private static <V> V[] newArray(int i2) {
        return (V[]) new Object[i2];
    }
}
