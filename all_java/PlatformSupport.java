package com.unity3d.player;

import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class PlatformSupport {
    static final boolean MARSHMALLOW_SUPPORT;
    static final boolean NOUGAT_SUPPORT;

    static {
        int i2 = Build.VERSION.SDK_INT;
        MARSHMALLOW_SUPPORT = i2 >= 23;
        NOUGAT_SUPPORT = i2 >= 24;
    }
}
