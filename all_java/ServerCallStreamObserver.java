package io.grpc.stub;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public abstract class ServerCallStreamObserver<RespT> extends CallStreamObserver<RespT> {
    public abstract boolean isCancelled();

    @Override // io.grpc.stub.CallStreamObserver
    public abstract boolean isReady();

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void request(int i2);

    public abstract void setCompression(String str);

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void setMessageCompression(boolean z);

    public abstract void setOnCancelHandler(Runnable runnable);

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void setOnReadyHandler(Runnable runnable);

    public void disableAutoRequest() {
        throw new UnsupportedOperationException();
    }

    public void setOnCloseHandler(Runnable runnable) {
        throw new UnsupportedOperationException();
    }
}
