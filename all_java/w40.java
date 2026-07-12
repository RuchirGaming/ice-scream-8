package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f36259a = new AtomicLong();

    public static long a() {
        return f36259a.getAndIncrement();
    }
}
