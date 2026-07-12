package com.unity3d.player;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private M f23930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23931b = false;

    public L(M m2, M m3) {
        this.f23930a = m3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.f23931b) {
            return;
        }
        int i2 = M.y;
        this.f23930a.cancelOnPrepare();
    }
}
