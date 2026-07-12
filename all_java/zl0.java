package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class zl0 implements wl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f37359a;

    public zl0(View view) {
        this.f37359a = view;
    }

    @Override // com.yandex.mobile.ads.impl.wl0
    public final void setMuted(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.wl0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f37359a.setOnClickListener(onClickListener);
    }
}
