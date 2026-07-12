package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ef1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f30377a = TimeUnit.SECONDS.toMillis(1);

    public static void a(TextView textView, long j2, long j3) {
        textView.setText(String.valueOf((int) Math.ceil((j2 - j3) / f30377a)));
    }
}
