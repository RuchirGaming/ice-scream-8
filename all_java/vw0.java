package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class vw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<ScanResult> f36201a = new a();

    final class a implements Comparator<ScanResult> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult.level - scanResult2.level;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 0 ? activeNetworkInfo.getTypeName() : activeNetworkInfo.getSubtypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static Point b(Context context) {
        int height;
        int i2;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.widthPixels;
            height = displayMetrics.heightPixels;
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int iIntValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                height = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i2 = iIntValue;
            } catch (Exception unused) {
                int width = defaultDisplay.getWidth();
                height = defaultDisplay.getHeight();
                i2 = width;
            }
        }
        return new Point(i2, height);
    }

    public static String c(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(com.ironsource.network.b.f17383b);
            if (!wifiManager.isWifiEnabled()) {
                return null;
            }
            List<ScanResult> scanResults = wifiManager.getScanResults();
            Object obj = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
            int i2 = 0;
            if (obj == null) {
                obj = new Object[0];
            }
            ScanResult[] scanResultArr = (ScanResult[]) obj;
            Arrays.sort(scanResultArr, Collections.reverseOrder(f36201a));
            if (scanResultArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                int iMin = Math.min(3, scanResultArr.length);
                while (i2 < iMin) {
                    sb.append(scanResultArr[i2].BSSID);
                    sb.append(",");
                    sb.append(scanResultArr[i2].level);
                    i2++;
                    sb.append(i2 < iMin ? ";" : "");
                }
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
