package com.yodo1.mas.utils;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yodo1.mas.Yodo1MasLog;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasAgePopUtil {
    private static final String TAG = "Yodo1MasAgePopUtil";

    public static Integer formatColor(String colorStr, String note) {
        if (!TextUtils.isEmpty(colorStr)) {
            try {
                return Integer.valueOf(Color.parseColor(colorStr));
            } catch (Exception unused) {
                Yodo1MasLog.d(TAG, "The color value you set for " + note + " is " + colorStr + " is unknown color");
            }
        }
        return null;
    }

    public static void setBackgroundColor(View v, int customColor) {
        if (customColor != 0) {
            v.setBackgroundColor(customColor);
        }
    }

    public static void setTextColor(TextView v, int customColor) {
        if (customColor != 0) {
            v.setTextColor(customColor);
        }
    }

    public static Locale getCurrentLocale(Context pContext) {
        if (Build.VERSION.SDK_INT >= 24) {
            return pContext.getResources().getConfiguration().getLocales().get(0);
        }
        return pContext.getResources().getConfiguration().locale;
    }

    public static String getCurrentLanguage(Context context) {
        Locale currentLocale = getCurrentLocale(context);
        if (currentLocale != null) {
            return currentLocale.getLanguage();
        }
        return null;
    }
}
