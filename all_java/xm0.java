package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class xm0 implements vm0 {
    @Override // com.yandex.mobile.ads.impl.vm0
    public final ProgressBar a(View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.vm0
    public final View b(View view) {
        return view.findViewWithTag("close");
    }
}
