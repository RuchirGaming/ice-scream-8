package com.yandex.mobile.ads.impl;

import android.os.Build;
import com.amazon.device.ads.DtbDeviceData;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class mv1 {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        wv1.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        wv1.a(jSONObject, DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY, Integer.toString(Build.VERSION.SDK_INT));
        wv1.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
