package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2 f32490a = a(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z2 f32491b = a(5, "android.webkit.WebView database is inoperable", "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z2 f32492c = a(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z2 f32493d = a(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z2 f32494e = a(5, "android.webkit.WebView creation failed", "android.webkit.WebView creation failed. Try using another device for testing.");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z2 f32495f = a(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z2 f32496g = a(1, "Ad request failed with unexpected exception", "Ad request failed with unexpected exception");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z2 f32497h = a(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z2 f32498i = a(1, "The loaded banner can't fit in the container.", "The loaded banner can't fit in the container.");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z2 f32499j = a(1, "Banner rendering failed with timeout", "Banner rendering failed with timeout. Please try again.");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z2 f32500k = a(1, "Invalid SDK state.", "Invalid SDK state.");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z2 f32501l = a(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z2 f32502m = a(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z2 f32503n = a(2, "Ad request configured incorrectly", "Ad request configured incorrectly");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z2 f32504o = a(2, "Invalid request parameters", "Invalid request parameters");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z2 f32505p = a(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z2 f32506q = a(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z2 f32507r = a(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z2 f32508s = a(0, "Unknown error", "Unknown error");

    public static z2 a(String str) {
        String str2;
        String str3;
        if (str == null || str.isEmpty()) {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        } else {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Provided ad unit id doesn't exist";
        }
        return a(2, str3, String.format(Locale.US, str2, str));
    }

    public static z2 a(int i2, int i3, int i4, int i5, int i6, int i7) {
        return a(1, "Ad was loaded successfully, but there is not enough space to display it", String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
    }

    public static z2 a(String str, String str2) {
        return a(1, str, str2);
    }

    private static z2 a(int i2, String str, String str2) {
        return new z2(i2, str, str2, null);
    }
}
