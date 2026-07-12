package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class np1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f33167a;

    public np1(TextView textView) {
        this.f33167a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f33167a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
