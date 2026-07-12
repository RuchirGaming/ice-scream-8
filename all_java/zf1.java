package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class zf1 implements yf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w51 f37292a = new w51();

    @Override // com.yandex.mobile.ads.impl.yf1
    public final TextView a(View view) {
        w51 w51Var = this.f37292a;
        View viewFindViewWithTag = view.findViewWithTag("timer_value");
        w51Var.getClass();
        return (TextView) w51.a(TextView.class, viewFindViewWithTag);
    }

    @Override // com.yandex.mobile.ads.impl.yf1
    public final View b(View view) {
        w51 w51Var = this.f37292a;
        View viewFindViewWithTag = view.findViewWithTag("timer_container");
        w51Var.getClass();
        return (View) w51.a(View.class, viewFindViewWithTag);
    }
}
