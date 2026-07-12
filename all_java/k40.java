package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class k40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f32154a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f32155b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32156c = 0;

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f32155b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static long a(String str, String str2) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                dd0.b("HttpUtil", "Unexpected Content-Length [" + str + com.ironsource.sdk.constants.a.i.f17749e);
                j2 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = f32154a.matcher(str2);
        if (!matcher.matches()) {
            return j2;
        }
        try {
            String strGroup = matcher.group(2);
            strGroup.getClass();
            long j3 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            strGroup2.getClass();
            long j4 = (j3 - Long.parseLong(strGroup2)) + 1;
            if (j2 < 0) {
                return j4;
            }
            if (j2 == j4) {
                return j2;
            }
            dd0.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + com.ironsource.sdk.constants.a.i.f17749e);
            return Math.max(j2, j4);
        } catch (NumberFormatException unused2) {
            dd0.b("HttpUtil", "Unexpected Content-Range [" + str2 + com.ironsource.sdk.constants.a.i.f17749e);
            return j2;
        }
    }
}
