package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface Predicate<T> {
    boolean apply(@NullableDecl T t);

    boolean equals(@NullableDecl Object obj);
}
