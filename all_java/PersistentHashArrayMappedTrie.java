package io.grpc;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
final class PersistentHashArrayMappedTrie {

    interface Node<K, V> {
        V get(K k2, int i2, int i3);

        Node<K, V> put(K k2, V v, int i2, int i3);

        int size();
    }

    private PersistentHashArrayMappedTrie() {
    }

    static <K, V> V get(Node<K, V> node, K k2) {
        if (node == null) {
            return null;
        }
        return node.get(k2, k2.hashCode(), 0);
    }

    static <K, V> Node<K, V> put(Node<K, V> node, K k2, V v) {
        if (node == null) {
            return new Leaf(k2, v);
        }
        return node.put(k2, v, k2.hashCode(), 0);
    }

    static final class Leaf<K, V> implements Node<K, V> {
        private final K key;
        private final V value;

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public int size() {
            return 1;
        }

        public Leaf(K k2, V v) {
            this.key = k2;
            this.value = v;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public V get(K k2, int i2, int i3) {
            if (this.key == k2) {
                return this.value;
            }
            return null;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public Node<K, V> put(K k2, V v, int i2, int i3) {
            int iHashCode = this.key.hashCode();
            if (iHashCode != i2) {
                return CompressedIndex.combine(new Leaf(k2, v), i2, this, iHashCode, i3);
            }
            if (this.key == k2) {
                return new Leaf(k2, v);
            }
            return new CollisionLeaf(this.key, this.value, k2, v);
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.key, this.value);
        }
    }

    static final class CollisionLeaf<K, V> implements Node<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final K[] keys;
        private final V[] values;

        CollisionLeaf(K k2, V v, K k3, V v2) {
            this(new Object[]{k2, k3}, new Object[]{v, v2});
        }

        private CollisionLeaf(K[] kArr, V[] vArr) {
            this.keys = kArr;
            this.values = vArr;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public int size() {
            return this.values.length;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public V get(K k2, int i2, int i3) {
            int i4 = 0;
            while (true) {
                K[] kArr = this.keys;
                if (i4 >= kArr.length) {
                    return null;
                }
                if (kArr[i4] == k2) {
                    return this.values[i4];
                }
                i4++;
            }
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public Node<K, V> put(K k2, V v, int i2, int i3) {
            int iHashCode = this.keys[0].hashCode();
            if (iHashCode != i2) {
                return CompressedIndex.combine(new Leaf(k2, v), i2, this, iHashCode, i3);
            }
            int iIndexOfKey = indexOfKey(k2);
            if (iIndexOfKey != -1) {
                K[] kArr = this.keys;
                Object[] objArrCopyOf = Arrays.copyOf(kArr, kArr.length);
                Object[] objArrCopyOf2 = Arrays.copyOf(this.values, this.keys.length);
                objArrCopyOf[iIndexOfKey] = k2;
                objArrCopyOf2[iIndexOfKey] = v;
                return new CollisionLeaf(objArrCopyOf, objArrCopyOf2);
            }
            K[] kArr2 = this.keys;
            Object[] objArrCopyOf3 = Arrays.copyOf(kArr2, kArr2.length + 1);
            Object[] objArrCopyOf4 = Arrays.copyOf(this.values, this.keys.length + 1);
            K[] kArr3 = this.keys;
            objArrCopyOf3[kArr3.length] = k2;
            objArrCopyOf4[kArr3.length] = v;
            return new CollisionLeaf(objArrCopyOf3, objArrCopyOf4);
        }

        private int indexOfKey(K k2) {
            int i2 = 0;
            while (true) {
                K[] kArr = this.keys;
                if (i2 >= kArr.length) {
                    return -1;
                }
                if (kArr[i2] == k2) {
                    return i2;
                }
                i2++;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i2 = 0; i2 < this.values.length; i2++) {
                sb.append("(key=");
                sb.append(this.keys[i2]);
                sb.append(" value=");
                sb.append(this.values[i2]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }
    }

    static final class CompressedIndex<K, V> implements Node<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final int BITS = 5;
        private static final int BITS_MASK = 31;
        final int bitmap;
        private final int size;
        final Node<K, V>[] values;

        private static int uncompressedIndex(int i2, int i3) {
            return (i2 >>> i3) & 31;
        }

        private CompressedIndex(int i2, Node<K, V>[] nodeArr, int i3) {
            this.bitmap = i2;
            this.values = nodeArr;
            this.size = i3;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public int size() {
            return this.size;
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public V get(K k2, int i2, int i3) {
            int iIndexBit = indexBit(i2, i3);
            if ((this.bitmap & iIndexBit) == 0) {
                return null;
            }
            return this.values[compressedIndex(iIndexBit)].get(k2, i2, i3 + 5);
        }

        @Override // io.grpc.PersistentHashArrayMappedTrie.Node
        public Node<K, V> put(K k2, V v, int i2, int i3) {
            int iIndexBit = indexBit(i2, i3);
            int iCompressedIndex = compressedIndex(iIndexBit);
            int i4 = this.bitmap;
            if ((i4 & iIndexBit) == 0) {
                int i5 = i4 | iIndexBit;
                Node<K, V>[] nodeArr = this.values;
                Node[] nodeArr2 = new Node[nodeArr.length + 1];
                System.arraycopy(nodeArr, 0, nodeArr2, 0, iCompressedIndex);
                nodeArr2[iCompressedIndex] = new Leaf(k2, v);
                Node<K, V>[] nodeArr3 = this.values;
                System.arraycopy(nodeArr3, iCompressedIndex, nodeArr2, iCompressedIndex + 1, nodeArr3.length - iCompressedIndex);
                return new CompressedIndex(i5, nodeArr2, size() + 1);
            }
            Node<K, V>[] nodeArr4 = this.values;
            Node[] nodeArr5 = (Node[]) Arrays.copyOf(nodeArr4, nodeArr4.length);
            nodeArr5[iCompressedIndex] = this.values[iCompressedIndex].put(k2, v, i2, i3 + 5);
            return new CompressedIndex(this.bitmap, nodeArr5, (size() + nodeArr5[iCompressedIndex].size()) - this.values[iCompressedIndex].size());
        }

        static <K, V> Node<K, V> combine(Node<K, V> node, int i2, Node<K, V> node2, int i3, int i4) {
            int iIndexBit = indexBit(i2, i4);
            int iIndexBit2 = indexBit(i3, i4);
            if (iIndexBit == iIndexBit2) {
                Node nodeCombine = combine(node, i2, node2, i3, i4 + 5);
                return new CompressedIndex(iIndexBit, new Node[]{nodeCombine}, nodeCombine.size());
            }
            if (uncompressedIndex(i2, i4) > uncompressedIndex(i3, i4)) {
                node2 = node;
                node = node2;
            }
            return new CompressedIndex(iIndexBit | iIndexBit2, new Node[]{node, node2}, node.size() + node2.size());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.bitmap)));
            for (Node<K, V> node : this.values) {
                sb.append(node);
                sb.append(" ");
            }
            sb.append(")");
            return sb.toString();
        }

        private int compressedIndex(int i2) {
            return Integer.bitCount((i2 - 1) & this.bitmap);
        }

        private static int indexBit(int i2, int i3) {
            return 1 << uncompressedIndex(i2, i3);
        }
    }
}
