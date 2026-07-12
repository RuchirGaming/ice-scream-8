package com.mbridge.msdk.playercommon.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface ShuffleOrder {
    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i2, int i3);

    ShuffleOrder cloneAndRemove(int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i2);

    int getPreviousIndex(int i2);

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i2) {
            this(i2, new Random());
        }

        public DefaultShuffleOrder(int i2, long j2) {
            this(i2, new Random(j2));
        }

        private DefaultShuffleOrder(int i2, Random random) {
            this(createShuffledList(i2, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.indexInShuffled[iArr[i2]] = i2;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getNextIndex(int i2) {
            int i3 = this.indexInShuffled[i2] + 1;
            int[] iArr = this.shuffled;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getPreviousIndex(int i2) {
            int i3 = this.indexInShuffled[i2] - 1;
            if (i3 >= 0) {
                return this.shuffled[i3];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.random.nextInt(this.shuffled.length + 1);
                int i6 = i5 + 1;
                int iNextInt = this.random.nextInt(i6);
                iArr2[i5] = iArr2[iNextInt];
                iArr2[iNextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i4 < iArr4.length + i3) {
                    if (i7 < i3 && i8 == iArr[i7]) {
                        iArr3[i4] = iArr2[i7];
                        i7++;
                    } else {
                        int i9 = i8 + 1;
                        iArr3[i4] = iArr4[i8];
                        if (iArr3[i4] >= i2) {
                            iArr3[i4] = iArr3[i4] + i3;
                        }
                        i8 = i9;
                    }
                    i4++;
                } else {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i2) {
            int[] iArr = new int[this.shuffled.length - 1];
            int i3 = 0;
            boolean z = false;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i3 < iArr2.length) {
                    if (iArr2[i3] == i2) {
                        z = true;
                    } else {
                        iArr[z ? i3 - 1 : i3] = iArr2[i3] > i2 ? iArr2[i3] - 1 : iArr2[i3];
                    }
                    i3++;
                } else {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        private static int[] createShuffledList(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getPreviousIndex(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        public UnshuffledShuffleOrder(int i2) {
            this.length = i2;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLength() {
            return this.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getNextIndex(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.length) {
                return i3;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getLastIndex() {
            int i2 = this.length;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndInsert(int i2, int i3) {
            return new UnshuffledShuffleOrder(this.length + i3);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndRemove(int i2) {
            return new UnshuffledShuffleOrder(this.length - 1);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.source.ShuffleOrder
        public final ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }
    }
}
