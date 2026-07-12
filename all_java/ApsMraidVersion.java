package com.amazon.aps.ads.model;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public enum ApsMraidVersion {
    MRAID_V1("1.0"),
    MRAID_V2("2.0"),
    MRAID_V3("3.0");

    private String version;

    ApsMraidVersion(String str) {
        this.version = str;
    }

    public String getString() {
        return this.version;
    }
}
