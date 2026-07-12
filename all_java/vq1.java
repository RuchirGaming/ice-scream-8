package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class vq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f36159a = Log.isLoggable("Volley", 2);

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f36160c = vq1.f36159a;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f36161a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36162b = false;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.vq1$a$a, reason: collision with other inner class name */
        private static class C0460a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f36163a;

            public C0460a(String str, long j2, long j3) {
                this.f36163a = j3;
            }
        }

        a() {
        }

        public final synchronized void a(String str, long j2) {
            if (this.f36162b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f36161a.add(new C0460a(str, j2, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() throws Throwable {
            if (this.f36162b) {
                return;
            }
            a();
        }

        public final synchronized void a() {
            long j2;
            this.f36162b = true;
            if (this.f36161a.size() == 0) {
                j2 = 0;
            } else {
                long j3 = ((C0460a) this.f36161a.get(0)).f36163a;
                ArrayList arrayList = this.f36161a;
                j2 = ((C0460a) arrayList.get(arrayList.size() - 1)).f36163a - j3;
            }
            if (j2 <= 0) {
                return;
            }
            long j4 = ((C0460a) this.f36161a.get(0)).f36163a;
            Iterator it = this.f36161a.iterator();
            while (it.hasNext()) {
                long j5 = ((C0460a) it.next()).f36163a;
            }
        }
    }
}
