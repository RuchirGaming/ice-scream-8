package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class pe1 implements u10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList f33858b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f33859a;

    private static final class a implements u10.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f33860a;

        private a() {
        }

        public final a a(Message message) {
            this.f33860a = message;
            return this;
        }

        /* synthetic */ a(int i2) {
            this();
        }

        public final boolean a(Handler handler) {
            Message message = this.f33860a;
            message.getClass();
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            this.f33860a = null;
            pe1.a(this);
            return zSendMessageAtFrontOfQueue;
        }

        @Override // com.yandex.mobile.ads.impl.u10.a
        public final void a() {
            Message message = this.f33860a;
            message.getClass();
            message.sendToTarget();
            this.f33860a = null;
            pe1.a(this);
        }
    }

    public pe1(Handler handler) {
        this.f33859a = handler;
    }

    private static a d() {
        a aVar;
        ArrayList arrayList = f33858b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new a(0) : (a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final boolean a() {
        return this.f33859a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final boolean b(int i2) {
        return this.f33859a.sendEmptyMessage(i2);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final void c() {
        this.f33859a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final u10.a a(int i2) {
        return d().a(this.f33859a.obtainMessage(i2));
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final void b() {
        this.f33859a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final u10.a a(int i2, Object obj) {
        return d().a(this.f33859a.obtainMessage(i2, obj));
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final u10.a a(int i2, int i3) {
        return d().a(this.f33859a.obtainMessage(1, i2, i3));
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final boolean a(u10.a aVar) {
        return ((a) aVar).a(this.f33859a);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final boolean a(long j2) {
        return this.f33859a.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.yandex.mobile.ads.impl.u10
    public final boolean a(Runnable runnable) {
        return this.f33859a.post(runnable);
    }

    static void a(a aVar) {
        ArrayList arrayList = f33858b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar);
            }
        }
    }
}
