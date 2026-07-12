package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class IB {
    public static byte[] A0C;
    public static String[] A0D = {"xjDjhxCoR5E9PaR", "vpLFoDls1yXd", "vp7lX6ix760xQFA", "plC", "mnLR5dwnrEQUmTikV", "t5Nzngx1C9ROF", "WJjUxBMWNKZwORVrQ", "T20oC"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final I9 A0A;
    public final IA A0B;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 91;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[2] = "fcjVOHbVEUruwwj";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-13, -8, 2, -1, -5, -16, 8, 29, 15, 20, 10, 21, 29};
    }

    static {
        A04();
    }

    public IB() {
        this(null);
    }

    public IB(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 75));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = C1018Hx.A02 >= 17 ? A01(context) : null;
            this.A0B = IA.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = C.TIME_UNSET;
        this.A07 = C.TIME_UNSET;
    }

    public static long A00(long j2, long j3, long j4) {
        long j5;
        long vsyncCount = j4 * ((j2 - j3) / j4);
        long j6 = j3 + vsyncCount;
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            j5 = j6;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[7] = "KRnDU";
            j6 += j4;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private I9 A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 52));
        if (displayManager == null) {
            return null;
        }
        return new I9(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }

    private boolean A06(long j2, long j3) {
        long j4 = j2 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j3 - elapsedFrameTimeNs) - j4) > 20000000;
    }

    public final long A07(long j2, long j3) {
        long j4 = 1000 * j2;
        long j5 = j4;
        long j6 = j3;
        if (this.A08) {
            if (j2 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j7 = this.A01;
            if (j7 >= 6) {
                long j8 = this.A00 + ((j4 - this.A04) / j7);
                if (!A06(j8, j3)) {
                    j6 = (this.A05 + j8) - this.A04;
                    j5 = j8;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j4, j3)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j4;
            this.A05 = j3;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j2;
        this.A03 = j5;
        IA ia = this.A0B;
        if (ia != null) {
            long j9 = this.A06;
            if (A0D[2].length() != 15) {
                throw new RuntimeException();
            }
            A0D[3] = "GMIC0";
            if (j9 != C.TIME_UNSET) {
                long j10 = ia.A04;
                if (j10 == C.TIME_UNSET) {
                    return j6;
                }
                return A00(j6, j10, this.A06) - this.A07;
            }
        }
        return j6;
    }

    public final void A08() {
        if (this.A09 != null) {
            I9 i9 = this.A0A;
            if (i9 != null) {
                i9.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            I9 i9 = this.A0A;
            if (i9 != null) {
                i9.A00();
            }
            A03();
        }
    }
}
