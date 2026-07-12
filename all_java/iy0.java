package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.widget.PopupMenu;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class iy0 {
    public static void a(PopupMenu popupMenu) {
        if (Build.VERSION.SDK_INT >= 29) {
            popupMenu.setForceShowIcon(true);
            return;
        }
        Object obj = null;
        try {
            Field declaredField = popupMenu.getClass().getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            obj = declaredField.get(popupMenu);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
        if (obj != null) {
            try {
                obj.getClass().getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
            } catch (Exception unused2) {
            }
        }
    }
}
