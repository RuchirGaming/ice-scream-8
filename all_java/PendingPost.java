package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f19380d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f19382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f19383c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f19381a = obj;
        this.f19382b = subscription;
    }

    static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f19380d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f19381a = obj;
                pendingPostRemove.f19382b = subscription;
                pendingPostRemove.f19383c = null;
                return pendingPostRemove;
            }
            return new PendingPost(obj, subscription);
        }
    }

    static void a(PendingPost pendingPost) {
        pendingPost.f19381a = null;
        pendingPost.f19382b = null;
        pendingPost.f19383c = null;
        List<PendingPost> list = f19380d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
