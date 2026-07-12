package com.facebook.ads.redexgen.X;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.device.ads.DtbConstants;
import com.google.common.primitives.SignedBytes;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class Bg {
    public static byte[] A07;
    public static String[] A08 = {"FJwhSbR0Dqb1wEJXVBdpfUEyE2PwmXT5", "QXyUQtNV4ztNvs", "u680PItdmSCtrwUArgQMKOt5dGhFKyFy", "M6QX6bpZXsa0EpVfLqUIYL0ok3oIyD", "4ddrBoC1HSiu89JLzfXMV59B74qIm2xJ", "MUUz2dKYtP7sZF6Tuk5kEGRgHEx452fJ", "i1sqGOju2LE8Q92QQNgFTaNu0rUo1z4f", "5HWyWxmgcaxBLo1LpD3PpaOIjtbRMHJC"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] - i4;
            String[] strArr = A08;
            if (strArr[6].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "mZfo4fIlXHQscYR0BkWPKUfaL8c0bByk";
            strArr2[2] = "AkiufmiMzZJvhyS77AiglOXb5e3YRP2V";
            bArrCopyOfRange[i5] = (byte) (i6 - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-64, -44, -61, -56, -50, -114, -52, -49, -60, -58, 29, 49, 32, 37, 43, -21, 41, 44, 33, 35, -23, 8, -19, 50, 70, 53, 58, SignedBytes.MAX_POWER_OF_TWO, 0, 62, 65, 54, 56, -2, 29, 3};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A04(int i2, Bg bg) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = A0E[i6];
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i11 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? A09[i5 - 1] : A0D[i5 - 1];
            i9 = (((i7 * 12000) / i10) + i11) * 4;
            i8 = 384;
        } else {
            if (i3 == 3) {
                i7 = i4 == 2 ? A0A[i5 - 1] : A0B[i5 - 1];
                i8 = 1152;
                i9 = ((144000 * i7) / i10) + i11;
            } else {
                i7 = A0C[i5 - 1];
                i8 = i4 == 1 ? 576 : 1152;
                i9 = (((i4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i7) / i10) + i11;
            }
        }
        bg.A03(i3, A0F[3 - i4], i9, i10, ((i2 >> 6) & 3) == 3 ? 1 : 2, i7 * 1000, i8);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 94), A01(23, 13, 115), A01(0, 10, 1)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 288, DtbConstants.DEFAULT_PLAYER_WIDTH, 352, 384, TypedValues.Cycle.TYPE_PATH_ROTATE, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, DtbConstants.DEFAULT_PLAYER_WIDTH, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, DtbConstants.DEFAULT_PLAYER_WIDTH};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int i2) {
        int samplingRateIndex;
        int i3;
        int padding;
        int i4;
        int i5;
        int version;
        if ((i2 & (-2097152)) != -2097152 || (samplingRateIndex = (i2 >>> 19) & 3) == 1 || (i3 = (i2 >>> 17) & 3) == 0 || (padding = (i2 >>> 12) & 15) == 0 || padding == 15 || (i4 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int samplingRate = A0E[i4];
        if (samplingRateIndex == 2) {
            samplingRate /= 2;
        } else if (samplingRateIndex == 0) {
            samplingRate /= 4;
        }
        int i6 = (i2 >>> 9) & 1;
        String[] strArr = A08;
        String str = strArr[5];
        String str2 = strArr[4];
        int iCharAt = str.charAt(20);
        int version2 = str2.charAt(20);
        if (iCharAt == version2) {
            throw new RuntimeException();
        }
        A08[0] = "wCPzQVRdLc9fuoZbbzdyTQMs65DUcW8k";
        if (i3 == 3) {
            if (samplingRateIndex == 3) {
                int version3 = padding - 1;
                version = A09[version3];
            } else {
                int version4 = padding - 1;
                version = A0D[version4];
            }
            return (((version * 12000) / samplingRate) + i6) * 4;
        }
        if (samplingRateIndex == 3) {
            if (i3 == 2) {
                int version5 = padding - 1;
                i5 = A0A[version5];
            } else {
                int version6 = padding - 1;
                i5 = A0B[version6];
            }
        } else {
            int version7 = padding - 1;
            i5 = A0C[version7];
        }
        if (samplingRateIndex == 3) {
            int version8 = 144000 * i5;
            return (version8 / samplingRate) + i6;
        }
        int version9 = i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000;
        return ((version9 * i5) / samplingRate) + i6;
    }

    private void A03(int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.A05 = i2;
        this.A06 = str;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A04 = i7;
    }
}
