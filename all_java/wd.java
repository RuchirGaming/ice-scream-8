package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class wd<T extends View> implements ea<T> {
    @Override // com.yandex.mobile.ads.impl.ea
    public final void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final void cancel() {
    }
}
