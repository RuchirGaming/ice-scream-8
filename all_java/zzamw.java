package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzamw {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private zzamw(int i2, byte[] bArr, Map map, List list, boolean z, long j2) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    private static List zza(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzams((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzamw(int i2, byte[] bArr, Map map, boolean z, long j2) {
        this(i2, bArr, map, zza(map), z, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzamw(int i2, byte[] bArr, boolean z, long j2, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzams zzamsVar = (zzams) it.next();
                treeMap.put(zzamsVar.zza(), zzamsVar.zzb());
            }
        }
        this(i2, bArr, treeMap, list, z, j2);
    }

    @Deprecated
    public zzamw(byte[] bArr, Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
