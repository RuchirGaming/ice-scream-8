package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33914a;

    public pl() {
        this(0);
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f33914a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.f33914a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f33914a = false;
    }

    public final synchronized boolean d() {
        return this.f33914a;
    }

    public final synchronized boolean e() {
        if (this.f33914a) {
            return false;
        }
        this.f33914a = true;
        notifyAll();
        return true;
    }

    public pl(int i2) {
    }

    public final synchronized boolean a(long j2) throws InterruptedException {
        try {
            if (j2 <= 0) {
                return this.f33914a;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = j2 + jElapsedRealtime;
            if (j3 < jElapsedRealtime) {
                a();
            } else {
                while (!this.f33914a && jElapsedRealtime < j3) {
                    wait(j3 - jElapsedRealtime);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            return this.f33914a;
        } catch (Throwable th) {
            throw th;
        }
    }
}
