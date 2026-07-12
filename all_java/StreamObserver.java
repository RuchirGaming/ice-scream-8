package io.grpc.stub;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface StreamObserver<V> {
    void onCompleted();

    void onError(Throwable th);

    void onNext(V v);
}
