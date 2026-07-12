package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public abstract class zzfwo {
    zzfwo() {
    }

    static int zze(int i2, int i3) {
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = iHighestOneBit + iHighestOneBit;
        }
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    public abstract zzfwo zzb(Object obj);
}
