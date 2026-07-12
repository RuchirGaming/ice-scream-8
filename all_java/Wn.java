package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Wn {
    public ApplicationInfo a(Context context, String str, int i2) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public PackageInfo b(Context context, String str, int i2) {
        try {
            return context.getPackageManager().getPackageInfo(str, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(Context context, String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
