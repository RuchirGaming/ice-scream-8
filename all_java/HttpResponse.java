package com.google.firebase.crashlytics.internal.network;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int i2, String str) {
        this.code = i2;
        this.body = str;
    }

    public int code() {
        return this.code;
    }

    public String body() {
        return this.body;
    }
}
