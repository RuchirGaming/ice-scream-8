package com.facebook.ads;

import java.util.EnumSet;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;

    public static final EnumSet<CacheFlag> ALL = EnumSet.allOf(CacheFlag.class);
}
