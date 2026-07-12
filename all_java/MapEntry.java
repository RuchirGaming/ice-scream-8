package kotlin.reflect.jvm.internal.pcollections;

import com.ironsource.sdk.constants.a;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class MapEntry<K, V> implements Serializable {
    public final K key;
    public final V value;

    public MapEntry(K k2, V v) {
        this.key = k2;
        this.value = v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MapEntry)) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        K k2 = this.key;
        if (k2 == null) {
            if (mapEntry.key != null) {
                return false;
            }
        } else if (!k2.equals(mapEntry.key)) {
            return false;
        }
        V v = this.value;
        V v2 = mapEntry.value;
        if (v == null) {
            if (v2 != null) {
                return false;
            }
        } else if (!v.equals(v2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k2 = this.key;
        int iHashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.value;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.key + a.i.f17746b + this.value;
    }
}
