package androidx.arch.core.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected SafeIterableMap.Entry<K, V> get(K k2) {
        return this.mHashMap.get(k2);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K k2, V v) {
        SafeIterableMap.Entry<K, V> entry = get(k2);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k2, put(k2, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K k2) {
        V v = (V) super.remove(k2);
        this.mHashMap.remove(k2);
        return v;
    }

    public boolean contains(K k2) {
        return this.mHashMap.containsKey(k2);
    }

    public Map.Entry<K, V> ceil(K k2) {
        if (contains(k2)) {
            return this.mHashMap.get(k2).mPrevious;
        }
        return null;
    }
}
