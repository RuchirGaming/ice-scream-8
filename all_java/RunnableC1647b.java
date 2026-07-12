package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
class RunnableC1647b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set f24092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f24098g;

    RunnableC1647b(Set set, String str, int i2, long j2, long j3, int i3, int i4) {
        this.f24092a = set;
        this.f24093b = str;
        this.f24094c = i2;
        this.f24095d = j2;
        this.f24096e = j3;
        this.f24097f = i3;
        this.f24098g = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f24092a.iterator();
        while (it.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.f24093b, this.f24094c, this.f24095d, this.f24096e, this.f24097f, this.f24098g);
        }
    }
}
