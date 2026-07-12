package com.explorestack.iab.mraid;

import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public enum MraidViewState {
    LOADING,
    DEFAULT,
    RESIZED,
    EXPANDED,
    HIDDEN;

    public String toJsString() {
        return toString().toLowerCase(Locale.US);
    }
}
