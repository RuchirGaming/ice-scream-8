package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31155a;

    public gy(Context context) {
        this.f31155a = context;
    }

    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f31155a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
