package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C8G {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
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
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0056  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C8G(Map<String, String> map) {
        byte b2;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = 10000;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 70))) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 64))) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 35))) {
                        b2 = 11;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 87))) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 102))) {
                        b2 = 6;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 3575610:
                    if (key.equals(A01(137, 4, 17))) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 72))) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 94))) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 73))) {
                        b2 = 12;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 62))) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 73))) {
                        b2 = 9;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 3))) {
                        b2 = 8;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 59))) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case 8:
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case 9:
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case 10:
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case 12:
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                    }
                    break;
            }
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{119, 117, 119, 124, 113, 117, 118, 120, 113, 76, 75, 83, 68, 73, 76, 65, 68, 81, 76, 74, 75, 122, 65, 80, 87, 68, 81, 76, 74, 75, 122, 76, 75, 122, 86, SignedBytes.MAX_POWER_OF_TWO, 70, 74, 75, 65, 86, 87, 83, 84, 101, 76, 83, 95, 77, 91, 88, 83, 86, 83, 78, 67, 101, 74, 95, 72, 89, 95, 84, 78, 91, 93, 95, 1, 29, 16, 18, 20, 28, 20, 31, 5, 46, 25, 20, 24, 22, 25, 5, 57, 37, 40, 42, 44, 36, 44, 39, Base64.padSymbol, 22, 62, 32, 45, Base64.padSymbol, 33, 62, 41, 42, 62, 41, Utf8.REPLACEMENT_BYTE, 36, 70, 81, 82, 70, 81, 71, 92, 107, SignedBytes.MAX_POWER_OF_TWO, 92, 70, 81, 71, 92, 91, 88, 80, 35, 52, 32, 36, 52, 34, 37, 14, 37, 56, 60, 52, 62, 36, 37, 23, 26, 19, 6, 77, 82, 95, 94, 84, 100, 79, 82, 86, 94, 100, 75, 84, 87, 87, 82, 85, 92, 100, 82, 85, 79, 94, 73, 77, 90, 87, 77, 82, 94, 76, 90, 89, 82, 87, 82, 79, 66, 100, 88, 83, 94, 88, 80, 100, 82, 85, 82, 79, 82, 90, 87, 100, 95, 94, 87, 90, 66, 68, 91, 87, 69, 83, 80, 91, 94, 91, 70, 75, 109, 81, 90, 87, 81, 89, 109, 91, 92, 70, 87, SignedBytes.MAX_POWER_OF_TWO, 68, 83, 94, 90, 69, 73, 91, 77, 78, 69, SignedBytes.MAX_POWER_OF_TWO, 69, 88, 85, 115, 79, 68, 73, 79, 71, 115, 88, 69, 79, 71, 73, 94};
    }

    static {
        A02();
        A0H = C8G.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C8G A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C8G(map);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
