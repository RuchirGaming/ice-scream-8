package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
final class ae implements o {
    private static final List<a> acO = new ArrayList(50);
    private final Handler jS;

    public ae(Handler handler) {
        this.jS = handler;
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean fq(int i2) {
        return this.jS.hasMessages(i2);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a fr(int i2) {
        return pP().a(this.jS.obtainMessage(i2), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a c(int i2, Object obj) {
        return pP().a(this.jS.obtainMessage(i2, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a j(int i2, int i3, int i4) {
        return pP().a(this.jS.obtainMessage(i2, i3, i4), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i2, int i3, int i4, Object obj) {
        return pP().a(this.jS.obtainMessage(i2, i3, i4, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(o.a aVar) {
        return ((a) aVar).a(this.jS);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean fs(int i2) {
        return this.jS.sendEmptyMessage(i2);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean k(int i2, long j2) {
        return this.jS.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void ft(int i2) {
        this.jS.removeMessages(i2);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void Q(Object obj) {
        this.jS.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean e(Runnable runnable) {
        return this.jS.post(runnable);
    }

    private static a pP() {
        a aVarRemove;
        List<a> list = acO;
        synchronized (list) {
            if (list.isEmpty()) {
                aVarRemove = new a();
            } else {
                aVarRemove = list.remove(list.size() - 1);
            }
        }
        return aVarRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(a aVar) {
        List<a> list = acO;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(aVar);
            }
        }
    }

    private static final class a implements o.a {
        private Message acP;
        private ae acQ;

        private a() {
        }

        public a a(Message message, ae aeVar) {
            this.acP = message;
            this.acQ = aeVar;
            return this;
        }

        public boolean a(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.applovin.exoplayer2.l.a.checkNotNull(this.acP));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // com.applovin.exoplayer2.l.o.a
        public void oY() {
            ((Message) com.applovin.exoplayer2.l.a.checkNotNull(this.acP)).sendToTarget();
            recycle();
        }

        private void recycle() {
            this.acP = null;
            this.acQ = null;
            ae.a(this);
        }
    }
}
