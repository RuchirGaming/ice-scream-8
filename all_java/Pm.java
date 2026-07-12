package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Pm {
    public boolean a(Context context) {
        Boolean boolValueOf;
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        Boolean bool = Boolean.TRUE;
        if (userManager != null) {
            try {
                boolValueOf = Boolean.valueOf(userManager.isUserUnlocked());
            } catch (Throwable unused) {
                boolValueOf = null;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            bool = boolValueOf;
        }
        return bool.booleanValue();
    }
}
