package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    void clear() {
        this.set = 0;
        Arrays.fill(this.values, 0);
    }

    Settings set(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.values;
            if (i2 < iArr.length) {
                this.set = (1 << i2) | this.set;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    boolean isSet(int i2) {
        return ((1 << i2) & this.set) != 0;
    }

    int get(int i2) {
        return this.values[i2];
    }

    int size() {
        return Integer.bitCount(this.set);
    }

    int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    boolean getEnablePush(boolean z) {
        int i2;
        if ((this.set & 4) != 0) {
            i2 = this.values[2];
        } else {
            i2 = z ? 1 : 0;
        }
        return i2 == 1;
    }

    int getMaxConcurrentStreams(int i2) {
        return (this.set & 16) != 0 ? this.values[4] : i2;
    }

    int getMaxFrameSize(int i2) {
        return (this.set & 32) != 0 ? this.values[5] : i2;
    }

    int getMaxHeaderListSize(int i2) {
        return (this.set & 64) != 0 ? this.values[6] : i2;
    }

    int getInitialWindowSize() {
        if ((this.set & 128) != 0) {
            return this.values[7];
        }
        return 65535;
    }

    void merge(Settings settings) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (settings.isSet(i2)) {
                set(i2, settings.get(i2));
            }
        }
    }
}
