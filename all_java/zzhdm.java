package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzhdm {
    static HashSet zza(int i2) {
        return new HashSet(zzd(i2));
    }

    public static LinkedHashMap zzb(int i2) {
        return new LinkedHashMap(zzd(i2));
    }

    public static List zzc(int i2) {
        return i2 == 0 ? Collections.emptyList() : new ArrayList(i2);
    }

    private static int zzd(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
