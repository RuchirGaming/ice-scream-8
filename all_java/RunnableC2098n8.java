package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class RunnableC2098n8 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
