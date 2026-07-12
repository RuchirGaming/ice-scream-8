package com.pgl.ssdk;

import android.content.Context;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.pgl.ssdk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class C1588d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static double f23841a = -1.0d;

    public static String a(Context context) {
        int i2;
        double d2 = f23841a;
        double dDoubleValue = TelemetryConfig.DEFAULT_SAMPLING_FACTOR;
        if (d2 >= TelemetryConfig.DEFAULT_SAMPLING_FACTOR) {
            i2 = (int) d2;
        } else {
            try {
                Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
                Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
                Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
                declaredMethod.setAccessible(true);
                dDoubleValue = ((Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
            } catch (Throwable unused) {
            }
            f23841a = dDoubleValue;
            i2 = (int) dDoubleValue;
        }
        return Integer.toString(i2);
    }
}
