package com.explorestack.protobuf;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface RpcController {
    String errorText();

    boolean failed();

    boolean isCanceled();

    void notifyOnCancel(RpcCallback<Object> rpcCallback);

    void reset();

    void setFailed(String str);

    void startCancel();
}
