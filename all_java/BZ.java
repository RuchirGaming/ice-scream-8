package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class BZ {
    public static byte[] A00;
    public static String[] A01 = {"", "PlMS0jkvO9vM5P9u90Ds4f1TdgxD3Thw", "", "l", "pH03IupWUvAV01", "AaMD9RuQcbEx2RDlcaNkwISY5", "CN9ykJnxtHUTm8if1f3f2dcU", "LBX0HYPzD8"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static long A00(Map<String, String> map, String str) {
        if (map == null) {
            return C.TIME_UNSET;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C.TIME_UNSET;
        } catch (NumberFormatException unused) {
            return C.TIME_UNSET;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Pair<Long, Long> A01(BJ<?> bj) {
        Map<String, String> mapAE5 = bj.AE5();
        if (mapAE5 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(A00(mapAE5, A02(0, 24, 56))), Long.valueOf(A00(mapAE5, A02(24, 25, 22))));
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-14, 15, 9, 11, 20, 25, 11, -22, 27, 24, 7, 26, 15, 21, 20, -8, 11, 19, 7, 15, 20, 15, 20, 13, -44, -16, -27, -3, -26, -27, -25, -17, -56, -7, -10, -27, -8, -19, -13, -14, -42, -23, -15, -27, -19, -14, -19, -14, -21};
        String[] strArr = A01;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A01[1] = "ypeOQlh2OkKl5SxmyCjdjAc832M2Y7KR";
        A00 = bArr;
    }

    static {
        A03();
    }
}
