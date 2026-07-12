package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface Function<F, T> {
    @NullableDecl
    T apply(@NullableDecl F f2);

    boolean equals(@NullableDecl Object obj);
}
