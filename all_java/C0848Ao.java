package com.facebook.ads.redexgen.X;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0848Ao {
    public static String[] A0M = {"OjKCpSHRaQgRVuqtUlgsb9O8", "00OaDgM7p4igg1vHbesCR74DVTlAeC7z", "TzmlGabo8AOjcKFjChfq2OdnE6jP", "eUJX5SGKEEZf9vIFl", "j2zFnhkJHUredpBjDjfUiogYLN6sD6KJ", "gWZYAfYL2BaqEY2VQTncveV2", "fwiYKc5SQMrWihGSp5I7vQU09P9mYkrS", "9p8sUcgEmhCbeCaZ4cFvJcsv2VoCKNVu"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C0848Ao(int i2, int i3, float f2, float f3, int i4) {
        this.A0H = i2;
        this.A0G = i3;
        this.A0F = f2;
        this.A0D = f3;
        this.A0E = i2 / i4;
        this.A0K = i2 / 400;
        int i5 = i2 / 65;
        this.A0I = i5;
        int i6 = i5 * 2;
        this.A0J = i6;
        this.A0L = new short[i6];
        this.A0A = new short[i6 * i3];
        this.A0B = new short[i6 * i3];
        this.A0C = new short[i6 * i3];
    }

    private int A00(int i2) {
        int iMin = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i2, iMin);
        int frameCount = this.A09;
        this.A09 = frameCount - iMin;
        return iMin;
    }

    private int A01(short[] sArr, int i2) {
        int minP;
        int period;
        int i3 = this.A0H;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        int skip = this.A0G;
        if (skip == 1 && i4 == 1) {
            int i5 = this.A0K;
            int skip2 = this.A0I;
            minP = A04(sArr, i2, i5, skip2);
        } else {
            A0E(sArr, i2, i4);
            short[] sArr2 = this.A0L;
            int i6 = this.A0K / i4;
            int skip3 = this.A0I;
            minP = A04(sArr2, 0, i6, skip3 / i4);
            if (i4 != 1) {
                int minP2 = minP * i4;
                int skip4 = i4 * 4;
                int period2 = minP2 - skip4;
                int i7 = (i4 * 4) + minP2;
                int skip5 = this.A0K;
                if (period2 < skip5) {
                    period2 = this.A0K;
                }
                int skip6 = this.A0I;
                if (i7 > skip6) {
                    i7 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    minP = A04(sArr, i2, period2, i7);
                } else {
                    A0E(sArr, i2, 1);
                    minP = A04(this.A0L, 0, period2, i7);
                }
            }
        }
        int i8 = this.A02;
        int maxP = this.A01;
        String[] strArr = A0M;
        String str = strArr[5];
        String str2 = strArr[0];
        int period3 = str.length();
        int skip8 = str2.length();
        if (period3 != skip8) {
            throw new RuntimeException();
        }
        A0M[1] = "8bhQeTnLevaZP1Rdp3IHUAHszuXZY5fw";
        if (A0F(i8, maxP)) {
            period = this.A08;
        } else {
            period = minP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = minP;
        return period;
    }

    private int A02(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            i4 = i3;
            int newFrameCount = (int) ((i3 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i3 + i4;
        short[] sArrA0G = A0G(this.A0B, this.A05, newFrameCount2);
        this.A0B = sArrA0G;
        int i5 = this.A0G;
        int newFrameCount3 = this.A05;
        System.arraycopy(sArr, i2 * i5, sArrA0G, newFrameCount3 * i5, i5 * i3);
        A0C(i4, this.A0G, this.A0B, this.A05 + i3, sArr, i2 + i3, sArr, i2);
        int newFrameCount4 = this.A05;
        this.A05 = newFrameCount4 + i3 + i4;
        return i4;
    }

    private int A03(short[] sArr, int i2, float f2, int i3) {
        int newFrameCount;
        if (f2 >= 2.0f) {
            newFrameCount = (int) (i3 / (f2 - 1.0f));
        } else {
            this.A09 = (int) ((i3 * (2.0f - f2)) / (f2 - 1.0f));
            newFrameCount = i3;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        short[] sArrA0G = A0G(sArr2, newFrameCount2, newFrameCount);
        this.A0B = sArrA0G;
        A0C(newFrameCount, this.A0G, sArrA0G, this.A05, sArr, i2, sArr, i2 + i3);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i7 = i2 * bestPeriod;
        while (i3 <= i4) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i3; minDiff++) {
                int bestPeriod2 = i7 + minDiff;
                short s2 = sArr[bestPeriod2];
                int bestPeriod3 = i7 + i3;
                int worstPeriod = s2 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i5;
            int bestPeriod5 = period * i3;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i5 = i3;
            }
            int worstPeriod3 = diff * i6;
            int bestPeriod6 = maxDiff * i3;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i6 = i3;
            }
            i3++;
        }
        this.A02 = period / i5;
        this.A01 = maxDiff / i6;
        return i5;
    }

    private short A05(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[this.A0G + i2];
        int rightPosition = this.A03 * i3;
        int i5 = this.A04;
        int i6 = i5 * i4;
        int position = (i5 + 1) * i4;
        int i7 = position - rightPosition;
        int position2 = position - i6;
        short left = (short) (((i7 * s2) + ((position2 - i7) * s3)) / position2);
        return left;
    }

    private void A06() {
        int i2 = this.A05;
        float f2 = this.A0F;
        float f3 = this.A0D;
        float f4 = f2 / f3;
        float f5 = this.A0E * f3;
        if (f4 > 1.00001d || f4 < 0.99999d) {
            A07(f4);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f5 != 1.0f) {
            A08(f5, i2);
        }
    }

    private void A07(float f2) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i2 = this.A00;
        int i3 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i3);
                i3 += frameCount3;
            } else {
                int iA01 = A01(this.A0A, i3);
                if (f2 > 1.0d) {
                    int frameCount4 = A03(this.A0A, i3, f2, iA01);
                    i3 += frameCount4 + iA01;
                } else {
                    int frameCount5 = A02(this.A0A, i3, f2, iA01);
                    i3 += frameCount5;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i3 <= i2);
        A0B(i3);
    }

    private void A08(float f2, int i2) {
        int i3;
        int i4;
        if (this.A05 == i2) {
            return;
        }
        int i5 = (int) (this.A0H / f2);
        int i6 = this.A0H;
        while (true) {
            if (i5 <= 16384 && i6 <= 16384) {
                break;
            }
            i5 /= 2;
            i6 /= 2;
        }
        A09(i2);
        int i7 = 0;
        while (true) {
            int oldSampleRate = this.A06;
            int newSampleRate = oldSampleRate - 1;
            if (i7 < newSampleRate) {
                while (true) {
                    i3 = this.A04;
                    if (A0M[1].charAt(13) != 49) {
                        throw new RuntimeException();
                    }
                    A0M[3] = "26TQ7N8S6PTfGLZ92";
                    int oldSampleRate2 = (i3 + 1) * i5;
                    i4 = this.A03;
                    int newSampleRate2 = i4 * i6;
                    if (oldSampleRate2 > newSampleRate2) {
                        short[] sArr = this.A0B;
                        int newSampleRate3 = this.A05;
                        this.A0B = A0G(sArr, newSampleRate3, 1);
                        int i8 = 0;
                        while (true) {
                            int i9 = this.A0G;
                            String[] strArr = A0M;
                            String str = strArr[7];
                            String str2 = strArr[4];
                            int oldSampleRate3 = str.charAt(8);
                            int newSampleRate4 = str2.charAt(8);
                            if (oldSampleRate3 == newSampleRate4) {
                                A0M[2] = "aOt6eVUEyRCtQxkUrkKyixjvz9Bn1k7";
                                if (i8 >= i9) {
                                    break;
                                }
                                this.A0B[(this.A05 * i9) + i8] = A05(this.A0C, (i9 * i7) + i8, i6, i5);
                                i8++;
                            } else {
                                A0M[3] = "VbKq7NM7PdmAUrole";
                                if (i8 >= i9) {
                                    break;
                                }
                                this.A0B[(this.A05 * i9) + i8] = A05(this.A0C, (i9 * i7) + i8, i6, i5);
                                i8++;
                            }
                        }
                        int newSampleRate5 = this.A03;
                        this.A03 = newSampleRate5 + 1;
                        int newSampleRate6 = this.A05;
                        this.A05 = newSampleRate6 + 1;
                    }
                }
                int newSampleRate7 = i3 + 1;
                this.A04 = newSampleRate7;
                if (newSampleRate7 == i6) {
                    String[] strArr2 = A0M;
                    String str3 = strArr2[5];
                    String str4 = strArr2[0];
                    int oldSampleRate4 = str3.length();
                    int newSampleRate8 = str4.length();
                    if (oldSampleRate4 != newSampleRate8) {
                        throw new RuntimeException();
                    }
                    A0M[6] = "dm69MZtNxJx8v5BsJDIKlnc92CG6PQ3Q";
                    this.A04 = 0;
                    HI.A04(i4 == i5);
                    this.A03 = 0;
                }
                i7++;
            } else {
                A0A(oldSampleRate - 1);
                return;
            }
        }
    }

    private void A09(int i2) {
        int i3 = this.A05 - i2;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        short[] sArrA0G = A0G(sArr, frameCount, i3);
        this.A0C = sArrA0G;
        short[] sArr2 = this.A0B;
        int i4 = this.A0G;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i2 * i4, sArrA0G, frameCount2 * i4, i4 * i3);
        this.A05 = i2;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i3;
    }

    private void A0A(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i3 = this.A0G;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.A06 - i2) * i3);
        this.A06 -= i2;
    }

    private void A0B(int i2) {
        int i3 = this.A00 - i2;
        short[] sArr = this.A0A;
        int i4 = this.A0G;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.A00 = i3;
    }

    public static void A0C(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int t = (i6 * i3) + i7;
            int d2 = (i5 * i3) + i7;
            for (int u = 0; u < i2; u++) {
                int i9 = i2 - u;
                int o2 = sArr2[d2] * i9;
                int i10 = sArr3[t] * u;
                sArr[i8] = (short) ((o2 + i10) / i2);
                i8 += i3;
                d2 += i3;
                t += i3;
            }
        }
    }

    private void A0D(short[] sArr, int i2, int i3) {
        short[] sArrA0G = A0G(this.A0B, this.A05, i3);
        this.A0B = sArrA0G;
        int i4 = this.A0G;
        System.arraycopy(sArr, i2 * i4, sArrA0G, this.A05 * i4, i4 * i3);
        this.A05 += i3;
    }

    private void A0E(short[] sArr, int i2, int i3) {
        int i4 = this.A0J / i3;
        int frameCount = this.A0G;
        int j2 = frameCount * i3;
        int i5 = i2 * frameCount;
        for (int value = 0; value < i4; value++) {
            int samplesPerValue = 0;
            for (int i6 = 0; i6 < j2; i6++) {
                samplesPerValue += sArr[(value * j2) + i5 + i6];
            }
            this.A0L[value] = (short) (samplesPerValue / j2);
        }
    }

    private boolean A0F(int i2, int i3) {
        if (i2 == 0 || this.A08 == 0 || i3 > i2 * 3 || i2 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.A0G;
        int currentCapacityFrames = length / i4;
        if (i2 + i3 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i4 * (((currentCapacityFrames * 3) / 2) + i3));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i2;
        int i3 = this.A00;
        float f2 = this.A0F;
        float f3 = this.A0D;
        float r2 = f2 / f3;
        float f4 = this.A0E * f3;
        int i4 = this.A05;
        float s2 = i3;
        int remainingFrameCount = this.A06;
        int i5 = i4 + ((int) ((((s2 / r2) + remainingFrameCount) / f4) + 0.5f));
        short[] sArr = this.A0A;
        int i6 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i6, (remainingFrameCount2 * 2) + i3);
        int xSample = 0;
        while (true) {
            i2 = this.A0J;
            int remainingFrameCount3 = i2 * 2;
            int i7 = this.A0G;
            if (xSample >= remainingFrameCount3 * i7) {
                break;
            }
            this.A0A[(i7 * i3) + xSample] = 0;
            xSample++;
        }
        int remainingFrameCount4 = i2 * 2;
        this.A00 += remainingFrameCount4;
        A06();
        int remainingFrameCount5 = this.A05;
        if (remainingFrameCount5 > i5) {
            this.A05 = i5;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        shortBuffer.put(this.A0B, 0, this.A0G * iMin);
        int i2 = this.A05 - iMin;
        this.A05 = i2;
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        System.arraycopy(sArr, iMin * framesToRead, sArr, 0, i2 * framesToRead);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i2 = iRemaining / framesToWrite;
        short[] sArrA0G = A0G(this.A0A, this.A00, i2);
        this.A0A = sArrA0G;
        int bytesToWrite = this.A00;
        shortBuffer.get(sArrA0G, bytesToWrite * this.A0G, ((framesToWrite * i2) * 2) / 2);
        this.A00 += i2;
        A06();
    }
}
