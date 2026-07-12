package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kz0 f33942a = new kz0();

    public final void a(TextView textView, long j2, long j3) {
        this.f33942a.getClass();
        long jCeil = (long) Math.ceil((j2 - j3) / 1000.0f);
        textView.setText(String.format(Locale.US, "%02d:%02d", Long.valueOf(jCeil / 60), Long.valueOf(jCeil % 60)));
    }
}
