package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class yq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yq f37026c = new yq(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f37028b;

    public yq() {
        this(Collections.emptyMap());
    }

    public final yq a(im imVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f37028b);
        List<String> listB = imVar.b();
        boolean z = false;
        for (int i2 = 0; i2 < listB.size(); i2++) {
            map.remove(listB.get(i2));
        }
        for (Map.Entry<String, Object> entry : imVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(aj.f29080c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(key, bytes);
        }
        Map<String, byte[]> map2 = this.f37028b;
        if (map2.size() == map.size()) {
            for (Map.Entry<String, byte[]> entry2 : map2.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            z = true;
        }
        return z ? this : new yq(map);
    }

    public final long b() {
        byte[] bArr = this.f37028b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String c() {
        byte[] bArr = this.f37028b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, aj.f29080c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f37028b;
        Map<String, byte[]> map2 = ((yq) obj).f37028b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f37027a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f37028b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f37027a = iHashCode;
        }
        return this.f37027a;
    }

    public yq(Map<String, byte[]> map) {
        this.f37028b = Collections.unmodifiableMap(map);
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.f37028b.entrySet();
    }
}
