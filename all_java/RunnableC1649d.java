package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class RunnableC1649d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerMobileDataConfirmationCallback f24102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24103b;

    RunnableC1649d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.f24102a = iAssetPackManagerMobileDataConfirmationCallback;
        this.f24103b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24102a.onMobileDataConfirmationResult(this.f24103b);
    }
}
