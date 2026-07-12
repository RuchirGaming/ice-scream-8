package com.explorestack.iab.mraid;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public enum ViewPosition {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f8454c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8455a;

    ViewPosition(int i2) {
        this.f8455a = i2;
    }

    public static ViewPosition fromJsString(String str) {
        return fromJsString(str, TopRight);
    }

    public static ViewPosition fromJsString(String str, ViewPosition viewPosition) {
        if (TextUtils.isEmpty(str)) {
            return viewPosition;
        }
        if (!f8454c && str == null) {
            throw new AssertionError();
        }
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
                return Center;
            case "top-right":
                return TopRight;
            case "top-left":
                return TopLeft;
            case "bottom-left":
                return BottomLeft;
            case "bottom-right":
                return BottomRight;
            case "bottom-center":
                return BottomCenter;
            case "top-center":
                return TopCenter;
            default:
                return viewPosition;
        }
    }

    public int getGravity() {
        return this.f8455a;
    }
}
