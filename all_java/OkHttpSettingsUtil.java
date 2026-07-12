package io.grpc.okhttp;

import io.grpc.okhttp.internal.framed.Settings;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
class OkHttpSettingsUtil {
    public static final int ENABLE_PUSH = 2;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_HEADER_LIST_SIZE = 6;

    OkHttpSettingsUtil() {
    }

    public static boolean isSet(Settings settings, int i2) {
        return settings.isSet(i2);
    }

    public static int get(Settings settings, int i2) {
        return settings.get(i2);
    }

    public static void set(Settings settings, int i2, int i3) {
        settings.set(i2, 0, i3);
    }
}
