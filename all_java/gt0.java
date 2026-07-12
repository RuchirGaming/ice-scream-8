package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f31120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f31121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<w10> f31122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31123e;

    @Deprecated
    public gt0(int i2, byte[] bArr, Map map, boolean z) {
        this(i2, bArr, map, a((Map<String, String>) map), z);
    }

    private static Map<String, String> a(List<w10> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (w10 w10Var : list) {
            treeMap.put(w10Var.a(), w10Var.b());
        }
        return treeMap;
    }

    public gt0(int i2, byte[] bArr, boolean z, long j2, List<w10> list) {
        this(i2, bArr, a(list), list, z);
    }

    @Deprecated
    public gt0(int i2, byte[] bArr, Map map) {
        this(i2, bArr, map, true);
    }

    @Deprecated
    public gt0(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false);
    }

    private gt0(int i2, byte[] bArr, Map map, List list, boolean z) {
        this.f31119a = i2;
        this.f31120b = bArr;
        this.f31121c = map;
        if (list == null) {
            this.f31122d = null;
        } else {
            this.f31122d = Collections.unmodifiableList(list);
        }
        this.f31123e = z;
    }

    private static List<w10> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new w10(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
