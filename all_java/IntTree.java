package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class IntTree<V> {
    static final IntTree<Object> EMPTYNODE = new IntTree<>();
    private final long key;
    private final IntTree<V> left;
    private final IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0L;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private IntTree(long j2, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        this.key = j2;
        this.value = v;
        this.left = intTree;
        this.right = intTree2;
        this.size = intTree.size + 1 + intTree2.size;
    }

    private IntTree<V> withKey(long j2) {
        return (this.size == 0 || j2 == this.key) ? this : new IntTree<>(j2, this.value, this.left, this.right);
    }

    V get(long j2) {
        if (this.size == 0) {
            return null;
        }
        long j3 = this.key;
        if (j2 < j3) {
            return this.left.get(j2 - j3);
        }
        if (j2 > j3) {
            return this.right.get(j2 - j3);
        }
        return this.value;
    }

    IntTree<V> plus(long j2, V v) {
        if (this.size == 0) {
            return new IntTree<>(j2, v, this, this);
        }
        long j3 = this.key;
        if (j2 < j3) {
            return rebalanced(this.left.plus(j2 - j3, v), this.right);
        }
        if (j2 > j3) {
            return rebalanced(this.left, this.right.plus(j2 - j3, v));
        }
        return v == this.value ? this : new IntTree<>(j2, v, this.left, this.right);
    }

    IntTree<V> minus(long j2) {
        if (this.size == 0) {
            return this;
        }
        long j3 = this.key;
        if (j2 < j3) {
            return rebalanced(this.left.minus(j2 - j3), this.right);
        }
        if (j2 > j3) {
            return rebalanced(this.left, this.right.minus(j2 - j3));
        }
        IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            IntTree<V> intTree2 = this.right;
            return intTree2.withKey(intTree2.key + j3);
        }
        IntTree<V> intTree3 = this.right;
        if (intTree3.size == 0) {
            return intTree.withKey(intTree.key + j3);
        }
        long jMinKey = intTree3.minKey();
        long j4 = this.key;
        long j5 = jMinKey + j4;
        V v = this.right.get(j5 - j4);
        IntTree<V> intTreeMinus = this.right.minus(j5 - this.key);
        IntTree<V> intTreeWithKey = intTreeMinus.withKey((intTreeMinus.key + this.key) - j5);
        IntTree<V> intTree4 = this.left;
        return rebalanced(j5, v, intTree4.withKey((intTree4.key + this.key) - j5), intTreeWithKey);
    }

    private long minKey() {
        IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            return this.key;
        }
        return intTree.minKey() + this.key;
    }

    private IntTree<V> rebalanced(IntTree<V> intTree, IntTree<V> intTree2) {
        return (intTree == this.left && intTree2 == this.right) ? this : rebalanced(this.key, this.value, intTree, intTree2);
    }

    private static <V> IntTree<V> rebalanced(long j2, V v, IntTree<V> intTree, IntTree<V> intTree2) {
        int i2 = ((IntTree) intTree).size;
        int i3 = ((IntTree) intTree2).size;
        if (i2 + i3 > 1) {
            if (i2 >= i3 * 5) {
                IntTree<V> intTree3 = ((IntTree) intTree).left;
                IntTree<V> intTree4 = ((IntTree) intTree).right;
                if (((IntTree) intTree4).size < ((IntTree) intTree3).size * 2) {
                    long j3 = ((IntTree) intTree).key + j2;
                    V v2 = ((IntTree) intTree).value;
                    long j4 = ((IntTree) intTree).key;
                    return new IntTree<>(j3, v2, intTree3, new IntTree(-j4, v, intTree4.withKey(((IntTree) intTree4).key + j4), intTree2));
                }
                IntTree<V> intTree5 = ((IntTree) intTree4).left;
                IntTree<V> intTree6 = ((IntTree) intTree4).right;
                long j5 = ((IntTree) intTree4).key + ((IntTree) intTree).key + j2;
                V v3 = ((IntTree) intTree4).value;
                long j6 = ((IntTree) intTree4).key;
                IntTree intTree7 = new IntTree(-j6, ((IntTree) intTree).value, intTree3, intTree5.withKey(((IntTree) intTree5).key + j6));
                long j7 = ((IntTree) intTree).key;
                long j8 = ((IntTree) intTree4).key;
                return new IntTree<>(j5, v3, intTree7, new IntTree((-j7) - j8, v, intTree6.withKey(((IntTree) intTree6).key + j8 + j7), intTree2));
            }
            if (i3 >= i2 * 5) {
                IntTree<V> intTree8 = ((IntTree) intTree2).left;
                IntTree<V> intTree9 = ((IntTree) intTree2).right;
                if (((IntTree) intTree8).size < ((IntTree) intTree9).size * 2) {
                    long j9 = ((IntTree) intTree2).key + j2;
                    V v4 = ((IntTree) intTree2).value;
                    long j10 = ((IntTree) intTree2).key;
                    return new IntTree<>(j9, v4, new IntTree(-j10, v, intTree, intTree8.withKey(((IntTree) intTree8).key + j10)), intTree9);
                }
                IntTree<V> intTree10 = ((IntTree) intTree8).left;
                IntTree<V> intTree11 = ((IntTree) intTree8).right;
                long j11 = ((IntTree) intTree8).key + ((IntTree) intTree2).key + j2;
                V v5 = ((IntTree) intTree8).value;
                long j12 = ((IntTree) intTree2).key;
                long j13 = ((IntTree) intTree8).key;
                IntTree intTree12 = new IntTree((-j12) - j13, v, intTree, intTree10.withKey(((IntTree) intTree10).key + j13 + j12));
                long j14 = ((IntTree) intTree8).key;
                return new IntTree<>(j11, v5, intTree12, new IntTree(-j14, ((IntTree) intTree2).value, intTree11.withKey(((IntTree) intTree11).key + j14), intTree9));
            }
        }
        return new IntTree<>(j2, v, intTree, intTree2);
    }
}
