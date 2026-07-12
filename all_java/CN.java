package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class CN {
    public static byte[] A05;
    public static String[] A06 = {"ACQ", "Z1SKPMzbMAJhhabQH0qvIzzSk7pS7MzN", "6aLpRH6Tia4Sh8DeOCrm6uJB9pdHn", "T4Je7I0RF5bnUk10PIFXPnn9hg731vE9", "YJYhptho8kfm6vGcPcLLXGA80bzp3", "trfcxoKHMENKiNLiuCQzDNtcz23hOMTL", "PokKsHpwVBHIedcIPmeYCrQhpW", "5FKTxH2gEdxAxWs98iwby2xSeh4hilLh"};
    public final int A00;
    public final C0869Bl A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{110, 117, 103, -120, -70, -70, -68, -76, -80, -75, -82, 103, -120, -116, -102, 116, -118, -101, -103, 103, -86, -71, -64, -73, -69, -74, 103, -76, -74, -85, -84, 117, -102, -72, -89, -87, -79, -117, -76, -87, -72, -65, -74, -70, -81, -75, -76, -120, -75, -66, -103, -78, -73, -71, -76, -76, -77, -74, -72, -87, -88, 100, -76, -74, -77, -72, -87, -89, -72, -83, -77, -78, 100, -73, -89, -84, -87, -79, -87, 100, -72, -67, -76, -87, 100, 107, -118, -119, -118, 88, -76, -77, -76, -60, -64, -62, -53, -64, -54, -52, -43, -38};
    }

    static {
        A02();
    }

    public CN(boolean z, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        HI.A03((bArr2 == null) ^ (i2 == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i2;
        this.A04 = bArr2;
        this.A01 = new C0869Bl(A00(str), bArr, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public static int A00(String str) {
        byte b2;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 37))) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                        return 1;
                }
            case 3046671:
                if (str.equals(A01(90, 4, 79))) {
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                        return 1;
                }
            case 3049879:
                if (str.equals(A01(94, 4, 91))) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                        return 1;
                }
            case 3049895:
                String[] strArr = A06;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[6] = "rNJbBmSCz61bnA88RIw0tsQVuO";
                strArr2[4] = "wNvz1GaKF14i8ay7xmv7DcMchQNLl";
                if (str.equals(A01(98, 4, 101))) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                        return 1;
                }
            default:
                b2 = -1;
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                        return 1;
                }
        }
    }
}
