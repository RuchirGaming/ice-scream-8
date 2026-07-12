package com.yodo1.mas.mediation.admob;

import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasAdMobUtils {
    public static String getAdSource(String adapterClassName) {
        String[] strArrSplit = new String[6];
        if (adapterClassName != null) {
            strArrSplit = adapterClassName.split("\\.");
        }
        return strArrSplit[4];
    }

    public static String getFormatString(String methodName, String adType, String adUnitId, String adapterClassName) {
        String[] strArrSplit = new String[6];
        if (adapterClassName != null) {
            strArrSplit = adapterClassName.split("\\.");
        }
        return String.format("method: %s, %s, ad unit id: %s, network name: %s", methodName, adType, adUnitId, strArrSplit[4]);
    }

    public static String getAdErrorFormatString(String methodName, String adType, AdError adError) {
        return String.format("method: %s, %s, error: %s", methodName, adType, adError.toString());
    }
}
