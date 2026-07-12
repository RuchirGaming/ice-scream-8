package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface z91 {

    public static class a implements z91 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f37215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f37216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f37217c;

        public a() {
            this(new Random());
        }

        private static int[] a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final int a() {
            return this.f37216b.length;
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final int b(int i2) {
            int i3 = this.f37217c[i2] - 1;
            if (i3 >= 0) {
                return this.f37216b[i3];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final int c(int i2) {
            int i3 = this.f37217c[i2] + 1;
            int[] iArr = this.f37216b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final a d(int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f37215a.nextInt(this.f37216b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f37215a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + 0;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f37216b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f37216b;
                if (i3 >= iArr4.length + i2) {
                    return new a(iArr3, new Random(this.f37215a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= 0) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        private a(Random random) {
            this(a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final a a(int i2) {
            int i3 = i2 + 0;
            int[] iArr = new int[this.f37216b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f37216b;
                if (i4 >= iArr2.length) {
                    return new a(iArr, new Random(this.f37215a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < 0 || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        private a(int[] iArr, Random random) {
            this.f37216b = iArr;
            this.f37215a = random;
            this.f37217c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f37217c[iArr[i2]] = i2;
            }
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final int b() {
            int[] iArr = this.f37216b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final int c() {
            int[] iArr = this.f37216b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.z91
        public final a d() {
            return new a(new int[0], new Random(this.f37215a.nextLong()));
        }
    }

    int a();

    a a(int i2);

    int b();

    int b(int i2);

    int c();

    int c(int i2);

    a d();

    a d(int i2);
}
