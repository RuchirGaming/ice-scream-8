package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class MapBuilder<K, V> {
    private final Map<K, V> contributions;

    private MapBuilder(int i2) {
        this.contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(i2);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i2) {
        return new MapBuilder<>(i2);
    }

    public MapBuilder<K, V> put(K k2, V v) {
        this.contributions.put(k2, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.contributions.putAll(map);
        return this;
    }

    public Map<K, V> build() {
        if (this.contributions.size() == 0) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(this.contributions);
    }
}
