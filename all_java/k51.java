package com.yandex.mobile.ads.impl;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class k51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k51 f32182a = new k51();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f32183b = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    private k51() {
    }

    public static boolean a() {
        return b() || c();
    }

    private static boolean b() {
        try {
            return (Build.VERSION.SDK_INT >= 21 ? new File("/system/app/Superuser/Superuser.apk") : new File("/system/app/Superuser.apk")).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c() {
        try {
            String[] strArr = f32183b;
            boolean z = false;
            for (int i2 = 0; i2 < 8; i2++) {
                z = z || (Build.VERSION.SDK_INT < 31 && new File(strArr[i2]).exists());
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
