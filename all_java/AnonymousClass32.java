package com.facebook.ads.redexgen.X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.32, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public abstract class AnonymousClass32 {
    public static byte[] A02;
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{110, 89, 77, 73, 85, 78, 89, 88, 28, 81, 89, 72, 84, 83, 88, 28, 88, 89, 79, 72, 78, 83, 69, 117, 72, 89, 81, 28, 75, 93, 79, 28, 82, 83, 72, 28, 83, 74, 89, 78, 78, 85, 88, 88, 89, 82, 125, 74, 94, 90, 70, 93, 74, 75, 15, 66, 74, 91, 71, SignedBytes.MAX_POWER_OF_TWO, 75, 15, 70, 65, 92, 91, 78, 65, 91, 70, 78, 91, 74, 102, 91, 74, 66, 15, 88, 78, 92, 15, 65, SignedBytes.MAX_POWER_OF_TWO, 91, 15, SignedBytes.MAX_POWER_OF_TWO, 89, 74, 93, 93, 70, 75, 75, 74, 65};
    }

    public abstract int A05();

    public abstract boolean A0C(View view, Object obj);

    @Deprecated
    private final Object A00(View view, int i2) {
        throw new UnsupportedOperationException(A01(46, 50, 59));
    }

    @Deprecated
    private final void A03(View view, int i2, Object obj) {
        throw new UnsupportedOperationException(A01(0, 46, 40));
    }

    public final float A04(int i2) {
        return 1.0f;
    }

    public int A06(Object obj) {
        return -1;
    }

    public final Parcelable A07() {
        return null;
    }

    public Object A08(ViewGroup viewGroup, int i2) {
        return A00(viewGroup, i2);
    }

    public final void A09() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public final void A0A(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.A00 = dataSetObserver;
        }
    }

    public void A0B(ViewGroup viewGroup, int i2, Object obj) {
        A03(viewGroup, i2, obj);
    }
}
