package com.squareup.picasso;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    static boolean shouldReadFromMemoryCache(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i2) {
        return (i2 & NO_STORE.index) == 0;
    }

    MemoryPolicy(int i2) {
        this.index = i2;
    }
}
