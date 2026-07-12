package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ac<K, V> {
    boolean c(@NullableDecl K k2, @NullableDecl V v);

    void clear();

    Map<K, Collection<V>> fc();

    boolean h(@NullableDecl Object obj, @NullableDecl Object obj2);

    boolean i(@NullableDecl Object obj, @NullableDecl Object obj2);

    Collection<V> k(@NullableDecl K k2);

    int size();

    Collection<V> values();
}
