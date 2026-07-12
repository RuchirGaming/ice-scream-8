package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class yu implements zj {
    @Override // com.yandex.mobile.ads.impl.zj
    public final void a(View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.zj
    public final void b(View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
