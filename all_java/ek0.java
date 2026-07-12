package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f30476a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f30477b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f30478c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f30479d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f30480e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f30481f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f30482g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30489g;

        public final boolean a(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!ek0.a(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f30483a = i3;
            this.f30484b = ek0.f30476a[3 - i4];
            int i7 = ek0.f30477b[i6];
            this.f30486d = i7;
            if (i3 == 2) {
                this.f30486d = i7 / 2;
            } else if (i3 == 0) {
                this.f30486d = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f30489g = ek0.a(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? ek0.f30478c[i5 - 1] : ek0.f30479d[i5 - 1];
                this.f30488f = i9;
                this.f30485c = (((i9 * 12) / this.f30486d) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? ek0.f30480e[i5 - 1] : ek0.f30481f[i5 - 1];
                    this.f30488f = i10;
                    this.f30485c = ((i10 * 144) / this.f30486d) + i8;
                } else {
                    int i11 = ek0.f30482g[i5 - 1];
                    this.f30488f = i11;
                    this.f30485c = (((i4 == 1 ? 72 : 144) * i11) / this.f30486d) + i8;
                }
            }
            this.f30487e = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    static boolean a(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    static int a(int i2, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i2 != 3) {
            return 576;
        }
        return 1152;
    }

    public static int b(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f30477b[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f30478c[i5 - 1] : f30479d[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? f30480e[i5 - 1] : f30481f[i5 - 1];
        } else {
            i7 = f30482g[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static int c(int i2) {
        int i3;
        int i4;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        } else if (i3 != 3) {
            return 576;
        }
        return 1152;
    }
}
