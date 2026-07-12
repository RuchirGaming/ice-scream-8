package com.yandex.mobile.ads.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.ktx.BuildConfig;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum l60 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(BuildConfig.VERSION_NAME),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(com.ironsource.sdk.constants.a.h.f17743r),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("onePixel"),
    f32515b("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF79(InneractiveMediationNameConsts.OTHER);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32517a;

    l60(String str) {
        this.f32517a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32517a;
    }
}
