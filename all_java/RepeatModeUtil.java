package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    public @interface RepeatToggleModes {
    }

    public static boolean isRepeatModeEnabled(int i2, int i3) {
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            return i2 == 2 && (i3 & 2) != 0;
        }
        return (i3 & 1) != 0;
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i2, int i3) {
        for (int i4 = 1; i4 <= 2; i4++) {
            int i5 = (i2 + i4) % 3;
            if (isRepeatModeEnabled(i5, i3)) {
                return i5;
            }
        }
        return i2;
    }
}
