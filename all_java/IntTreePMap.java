package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class IntTreePMap<V> {
    private static final IntTreePMap<Object> EMPTY = new IntTreePMap<>(IntTree.EMPTYNODE);
    private final IntTree<V> root;

    public static <V> IntTreePMap<V> empty() {
        return (IntTreePMap<V>) EMPTY;
    }

    private IntTreePMap(IntTree<V> intTree) {
        this.root = intTree;
    }

    private IntTreePMap<V> withRoot(IntTree<V> intTree) {
        return intTree == this.root ? this : new IntTreePMap<>(intTree);
    }

    public V get(int i2) {
        return this.root.get(i2);
    }

    public IntTreePMap<V> plus(int i2, V v) {
        return withRoot(this.root.plus(i2, v));
    }

    public IntTreePMap<V> minus(int i2) {
        return withRoot(this.root.minus(i2));
    }
}
