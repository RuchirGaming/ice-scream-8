package io.grpc.okhttp;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final /* synthetic */ class OkHttpServerTransport$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ OkHttpServerTransport f$0;

    public /* synthetic */ OkHttpServerTransport$$ExternalSyntheticLambda4(OkHttpServerTransport okHttpServerTransport) {
        this.f$0 = okHttpServerTransport;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.triggerForcefulClose();
    }
}
