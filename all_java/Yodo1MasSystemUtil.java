package com.yodo1.mas.utils;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasSystemUtil {
    public static int getCurOrientation(Context context) {
        return 1 == context.getResources().getConfiguration().orientation ? 1 : 2;
    }

    public static String getAndroidId(Context mContext) {
        try {
            return Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
