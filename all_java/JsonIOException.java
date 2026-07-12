package com.google.gson;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class JsonIOException extends JsonParseException {
    private static final long serialVersionUID = 1;

    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, Throwable th) {
        super(str, th);
    }

    public JsonIOException(Throwable th) {
        super(th);
    }
}
