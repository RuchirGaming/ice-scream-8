package com.ironsource.mediationsdk;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.d f15727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b1 f15728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f15729c = null;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a1.this.f15728b.a();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a1.this.f15728b.a();
        }
    }

    public a1(com.ironsource.mediationsdk.utils.d dVar, b1 b1Var) {
        this.f15727a = dVar;
        this.f15728b = b1Var;
    }

    private void d() {
        Timer timer = this.f15729c;
        if (timer != null) {
            timer.cancel();
            this.f15729c = null;
        }
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f15729c = timer;
        timer.schedule(new b(), this.f15727a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f15728b.a();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f15729c = timer;
        timer.schedule(new a(), this.f15727a.j());
    }
}
