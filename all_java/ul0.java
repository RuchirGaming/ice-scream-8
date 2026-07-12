package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
public interface ul0<K, V> {
    Map<K, Collection<V>> a();

    boolean put(K k2, V v);

    Collection<V> values();
}
