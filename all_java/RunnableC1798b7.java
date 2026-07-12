package com.yandex.metrica.impl.ob;

import java.io.File;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class RunnableC1798b7<Output> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f26589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vm<File, Output> f26590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Um<File> f26591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Um<Output> f26592d;

    public RunnableC1798b7(File file, Vm<File, Output> vm, Um<File> um, Um<Output> um2) {
        this.f26589a = file;
        this.f26590b = vm;
        this.f26591c = um;
        this.f26592d = um2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f26589a.exists()) {
            try {
                Output outputA = this.f26590b.a(this.f26589a);
                if (outputA != null) {
                    this.f26592d.b(outputA);
                }
            } catch (Throwable unused) {
            }
            this.f26591c.b(this.f26589a);
        }
    }
}
