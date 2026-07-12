package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f19384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f19385b;

    PendingPostQueue() {
    }

    final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f19385b;
            if (pendingPost2 != null) {
                pendingPost2.f19383c = pendingPost;
                this.f19385b = pendingPost;
            } else {
                if (this.f19384a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f19385b = pendingPost;
                this.f19384a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f19384a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f19383c;
            this.f19384a = pendingPost2;
            if (pendingPost2 == null) {
                this.f19385b = null;
            }
        }
        return pendingPost;
    }

    final synchronized PendingPost a(int i2) throws InterruptedException {
        if (this.f19384a == null) {
            wait(i2);
        }
        return a();
    }
}
