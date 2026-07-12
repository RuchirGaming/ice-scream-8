package cn.thinkinganalyticsclone.android.utils;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TASensitiveInfo {
    public String getAndroidID(Context mContext) {
        try {
            return Settings.Secure.getString(mContext.getContentResolver(), "android_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
