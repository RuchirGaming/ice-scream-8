package io.grpc.stub;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public abstract class CallStreamObserver<V> implements StreamObserver<V> {
    public abstract void disableAutoInboundFlowControl();

    public abstract boolean isReady();

    public abstract void request(int i2);

    public abstract void setMessageCompression(boolean z);

    public abstract void setOnReadyHandler(Runnable runnable);
}
