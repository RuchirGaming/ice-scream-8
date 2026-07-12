package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: utfEncoding.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strings) {
        int i2;
        Intrinsics.checkNotNullParameter(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int length2 = strings.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            String str2 = strings[i3];
            i3++;
            int length3 = str2.length() - 1;
            if (length3 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    i2 = i4 + 1;
                    bArr[i4] = (byte) str2.charAt(i5);
                    if (i5 == length3) {
                        break;
                    }
                    i5 = i6;
                    i4 = i2;
                }
                i4 = i2;
            }
        }
        return bArr;
    }
}
