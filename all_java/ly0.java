package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum ly0 {
    f32722b(InstreamAdBreakType.PREROLL),
    f32723c(InstreamAdBreakType.MIDROLL),
    f32724d("postroll"),
    f32725e("standalone");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32727a;

    ly0(String str) {
        this.f32727a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32727a;
    }
}
