package com.yandex.mobile.ads.impl;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class uy0 {
    uy0() {
    }

    static Intent a(ty0 ty0Var) {
        String strC = ty0Var.c();
        String strB = ty0Var.b();
        Map<String, Object> mapA = ty0Var.a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strC));
        intent.addFlags(1342177280);
        intent.setPackage(strB);
        if (mapA != null) {
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, (Boolean) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                }
            }
        }
        return intent;
    }
}
