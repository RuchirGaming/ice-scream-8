package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class XI implements AJ {
    public static String[] A06 = {"LkLK", "abA9PNMrvscgwbqokpbH2", "wszIi3vfQywtet5OFqyTWUvoUYNS5ktb", "liexkOjxlVrdDutCVl0EvpIg3k3OXdWT", "uDjcyehsvUvWAc8oFKsUcicvrdYrbu", "Yx0xuqb7ConKzBOp6wI44fmqMUTcgjwu", "2AEFdY1ASteFDfy1ihWDcuoiihyMOIox", "2HHuLOzdt0KrTaQRoJg3USXKVGpaMcoz"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = AJ.A00;
    public ByteBuffer A04 = AJ.A00;

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A4N(int i2, int i3, int i4) throws AI {
        if (i4 == 3 || i4 == 2 || i4 == Integer.MIN_VALUE || i4 == 1073741824) {
            if (this.A02 != i2 || this.A00 != i3 || this.A01 != i4) {
                this.A02 = i2;
                this.A00 = i3;
                this.A01 = i4;
                return true;
            }
            String[] strArr = A06;
            if (strArr[5].charAt(14) == strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[4] = "26RCfMYW5Do9ItFOuFHGepjFl0G7YQ";
            return false;
        }
        throw new AI(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final ByteBuffer A7O() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = AJ.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7P() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7Q() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final int A7R() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8l() {
        int i2 = this.A01;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final boolean A8q() {
        return this.A05 && this.A04 == AJ.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE6() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.AJ
    public final void AE7(ByteBuffer byteBuffer) {
        int limit;
        int i2 = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i2;
        int position = this.A01;
        switch (position) {
            case Integer.MIN_VALUE:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case 1073741824:
                limit = limit2 / 2;
                break;
            default:
                throw new IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
            String[] strArr = A06;
            String str = strArr[5];
            String str2 = strArr[3];
            int limit3 = str.charAt(14);
            int position4 = str2.charAt(14);
            if (limit3 == position4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "hXv0xOe0fZxBP6BjMdwou1g9whaCh4Nv";
            strArr2[7] = "rvzJSg8TnEJLrC3bKKMSDNtobyDED6VD";
            this.A03 = byteBufferOrder;
        } else {
            this.A03.clear();
        }
        int position5 = this.A01;
        switch (position5) {
            case Integer.MIN_VALUE:
                while (i2 < resampledSize) {
                    int position6 = i2 + 1;
                    this.A03.put(byteBuffer.get(position6));
                    int position7 = i2 + 2;
                    this.A03.put(byteBuffer.get(position7));
                    i2 += 3;
                }
                int position8 = byteBuffer.limit();
                byteBuffer.position(position8);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 3:
                while (i2 < resampledSize) {
                    this.A03.put((byte) 0);
                    ByteBuffer byteBuffer2 = this.A03;
                    int position9 = byteBuffer.get(i2);
                    byte b2 = (byte) ((position9 & 255) - 128);
                    if (A06[1].length() != 4) {
                        String[] strArr3 = A06;
                        strArr3[5] = "93yfqVEE4BL66fKyhULGxcexfiDPz3ma";
                        strArr3[3] = "pJFS3cGyfO0gWrhajAAEFVsdSj1hVUV9";
                        byteBuffer2.put(b2);
                        i2++;
                    } else {
                        byteBuffer2.put(b2);
                        i2++;
                    }
                }
                int position10 = byteBuffer.limit();
                byteBuffer.position(position10);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            case 1073741824:
                while (i2 < resampledSize) {
                    int position11 = i2 + 2;
                    this.A03.put(byteBuffer.get(position11));
                    int position12 = i2 + 3;
                    this.A03.put(byteBuffer.get(position12));
                    i2 += 4;
                }
                int position13 = byteBuffer.limit();
                byteBuffer.position(position13);
                this.A03.flip();
                this.A04 = this.A03;
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void flush() {
        this.A04 = AJ.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = AJ.A00;
    }
}
