package com.facebook.ads.redexgen.X;

import com.ironsource.sdk.constants.b;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C06482g<E> implements Cloneable {
    public static byte[] A04;
    public static final Object A05;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final E A02(long j2, E e2) {
        E e3;
        int iA03 = C06472f.A03(this.A02, this.A00, j2);
        return (iA03 < 0 || (e3 = (E) this.A03[iA03]) == A05) ? e2 : e3;
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{19, 79, 83, 82, 72, 27, 118, 90, 75, 18, 91, 87, 51, 53};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0B(long j2, E e2) {
        int iA03 = C06472f.A03(this.A02, this.A00, j2);
        if (iA03 >= 0) {
            this.A03[iA03] = e2;
            return;
        }
        int iA04 = iA03 ^ (-1);
        int i2 = this.A00;
        if (iA04 < i2) {
            Object[] objArr = this.A03;
            if (objArr[iA04] == A05) {
                this.A02[iA04] = j2;
                objArr[iA04] = e2;
                return;
            }
        }
        if (this.A01 && i2 >= this.A02.length) {
            A04();
            iA04 = C06472f.A03(this.A02, this.A00, j2) ^ (-1);
        }
        int i3 = this.A00;
        if (i3 >= this.A02.length) {
            int iA00 = C06472f.A00(i3 + 1);
            long[] jArr = new long[iA00];
            Object[] objArr2 = new Object[iA00];
            long[] jArr2 = this.A02;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr;
            this.A03 = objArr2;
        }
        int i4 = this.A00;
        if (i4 - iA04 != 0) {
            long[] jArr3 = this.A02;
            System.arraycopy(jArr3, iA04, jArr3, iA04 + 1, i4 - iA04);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, iA04, objArr4, iA04 + 1, this.A00 - iA04);
        }
        this.A02[iA04] = j2;
        this.A03[iA04] = e2;
        this.A00++;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final String toString() {
        if (A06() <= 0) {
            return A03(12, 2, 126);
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                sb.append(A03(10, 2, 65));
            }
            sb.append(A00(i2));
            sb.append(b.R);
            E eA07 = A07(i2);
            if (eA07 != this) {
                sb.append(eA07);
            } else {
                sb.append(A03(0, 10, 13));
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    static {
        A05();
        A05 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C06482g() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public C06482g(int i2) {
        this.A01 = false;
        if (i2 == 0) {
            this.A02 = C06472f.A01;
            this.A03 = C06472f.A02;
        } else {
            int iA00 = C06472f.A00(i2);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i2) {
        if (this.A01) {
            A04();
        }
        return this.A02[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C06482g<E> clone() {
        C06482g<E> c06482g = null;
        try {
            c06482g = (C06482g) super.clone();
            c06482g.A02 = (long[]) this.A02.clone();
            c06482g.A03 = (Object[]) this.A03.clone();
            return c06482g;
        } catch (CloneNotSupportedException unused) {
            return c06482g;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i2 = this.A00;
        int i3 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != A05) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.A01 = false;
        this.A00 = i3;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i2) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i2];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j2) {
        return A02(j2, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i2 = this.A00;
        Object[] objArr = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2g != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i2) {
        Object[] objArr = this.A03;
        Object obj = objArr[i2];
        Object obj2 = A05;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.A01 = true;
        }
    }
}
