package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgdi implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzgdi zzgdiVar = (zzgdi) obj;
        int length = this.zza.length;
        int length2 = zzgdiVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i2];
            byte b3 = zzgdiVar.zza[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgdi) {
            return Arrays.equals(this.zza, ((zzgdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgub.zza(this.zza);
    }
}
