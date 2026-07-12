package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qs {
    public static File a(Context context, String str) {
        File cacheDir;
        try {
            if (!qy.a() || (cacheDir = context.getExternalCacheDir()) == null || !cacheDir.canWrite()) {
                cacheDir = null;
            }
        } catch (Exception unused) {
        }
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir.getPath() + File.separator + str);
    }
}
