package kotlinx.serialization.json.internal;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.UByte$$ExternalSyntheticBackport4;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final /* synthetic */ class AbstractJsonTreeEncoder$encodeTaggedInline$1$$ExternalSyntheticBackport3 {
    public static /* synthetic */ String m(long j2, int i2) {
        if (j2 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (j2 > 0) {
            return Long.toString(j2, i2);
        }
        if (i2 < 2 || i2 > 36) {
            i2 = 10;
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i2 - 1;
        if ((i2 & i4) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j2) & i4, i2);
                j2 >>>= iNumberOfTrailingZeros;
            } while (j2 != 0);
        } else {
            long jM = (i2 & 1) == 0 ? (j2 >>> 1) / ((long) (i2 >>> 1)) : UByte$$ExternalSyntheticBackport4.m(j2, i2);
            long j3 = i2;
            i3 = 63;
            cArr[63] = Character.forDigit((int) (j2 - (jM * j3)), i2);
            while (jM > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (jM % j3), i2);
                jM /= j3;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
