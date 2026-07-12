package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f32255a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(String str) {
        return f32255a.matcher(str).find();
    }
}
