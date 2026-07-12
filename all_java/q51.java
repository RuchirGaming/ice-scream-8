package com.yandex.mobile.ads.impl;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class q51<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pl f34119b = new pl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pl f34120c = new pl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f34121d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f34122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Thread f34123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34124g;

    protected q51() {
    }

    public final void a() {
        this.f34120c.b();
    }

    protected abstract void b();

    protected abstract void c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f34121d) {
            if (!this.f34124g && !this.f34120c.d()) {
                this.f34124g = true;
                b();
                Thread thread = this.f34123f;
                if (thread == null) {
                    this.f34119b.e();
                    this.f34120c.e();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f34120c.a();
        if (this.f34124g) {
            throw new CancellationException();
        }
        if (this.f34122e == null) {
            return null;
        }
        throw new ExecutionException(this.f34122e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34124g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34120c.d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f34121d) {
            if (this.f34124g) {
                return;
            }
            this.f34123f = Thread.currentThread();
            this.f34119b.e();
            try {
                try {
                    c();
                    synchronized (this.f34121d) {
                        this.f34120c.e();
                        this.f34123f = null;
                        Thread.interrupted();
                    }
                } catch (Exception e2) {
                    this.f34122e = e2;
                    synchronized (this.f34121d) {
                        this.f34120c.e();
                        this.f34123f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f34121d) {
                    this.f34120c.e();
                    this.f34123f = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f34120c.a(TimeUnit.MILLISECONDS.convert(j2, timeUnit))) {
            if (!this.f34124g) {
                if (this.f34122e == null) {
                    return null;
                }
                throw new ExecutionException(this.f34122e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
