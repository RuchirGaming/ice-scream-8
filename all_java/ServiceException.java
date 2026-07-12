package com.explorestack.protobuf;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ServiceException extends Exception {
    private static final long serialVersionUID = -1219262335729891920L;

    public ServiceException(String str) {
        super(str);
    }

    public ServiceException(Throwable th) {
        super(th);
    }

    public ServiceException(String str, Throwable th) {
        super(str, th);
    }
}
