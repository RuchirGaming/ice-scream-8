package com.unity3d.player;

/* JADX INFO: renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class RunnableC1652g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerStatusQueryCallback f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f24110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f24111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f24112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f24113e;

    RunnableC1652g(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j2, String[] strArr, int[] iArr, int[] iArr2) {
        this.f24109a = iAssetPackManagerStatusQueryCallback;
        this.f24110b = j2;
        this.f24111c = strArr;
        this.f24112d = iArr;
        this.f24113e = iArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24109a.onStatusResult(this.f24110b, this.f24111c, this.f24112d, this.f24113e);
    }
}
