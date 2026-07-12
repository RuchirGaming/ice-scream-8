package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class f31 {
    public static void a(Uri.Builder builder, Integer num) {
        if (num != null) {
            a(builder, "cmp_present", Integer.toString(num.intValue()));
        }
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
