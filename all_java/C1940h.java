package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1940h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f27011f = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f27012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f27013b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f27014c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f27015d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f27016e = new a();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1940h.this.f27015d.set(true);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$c */
    private class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = false;
            int i2 = 0;
            while (!isInterrupted()) {
                if (!z) {
                    C1940h.this.f27015d.set(false);
                    C1940h.this.f27013b.post(C1940h.this.f27016e);
                    i2 = 0;
                }
                try {
                    Thread.sleep(C1940h.f27011f);
                    if (C1940h.this.f27015d.get()) {
                        z = false;
                    } else {
                        i2++;
                        if (i2 == 4 && !Debug.isDebuggerConnected()) {
                            C1940h.this.b();
                        }
                        z = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C1940h(b bVar) {
        this.f27012a = bVar;
    }

    public void b() {
        this.f27012a.a();
    }

    public void c() {
        try {
            this.f27014c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f27014c.start();
    }
}
