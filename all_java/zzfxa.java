package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfxa {
    public static boolean zza(Iterable iterable, zzftz zzftzVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzftzVar);
            return zzc((List) iterable, zzftzVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzftzVar);
        boolean z = false;
        while (it.hasNext()) {
            if (zzftzVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzftz zzftzVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzftzVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    private static boolean zzc(List list, zzftz zzftzVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!zzftzVar.zza(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzftzVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzftzVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }
}
