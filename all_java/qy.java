package com.yandex.mobile.ads.impl;

import android.os.Environment;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qy {
    public static boolean a() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || !(Environment.isExternalStorageRemovable() || "mounted_ro".equals(externalStorageState));
    }
}
