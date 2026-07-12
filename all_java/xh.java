package com.yandex.mobile.ads.impl;

import java.io.File;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class xh implements Comparable<xh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f36690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36691f;

    public xh(String str, long j2, long j3, long j4, File file) {
        this.f36686a = str;
        this.f36687b = j2;
        this.f36688c = j3;
        this.f36689d = file != null;
        this.f36690e = file;
        this.f36691f = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(xh xhVar) {
        xh xhVar2 = xhVar;
        if (!this.f36686a.equals(xhVar2.f36686a)) {
            return this.f36686a.compareTo(xhVar2.f36686a);
        }
        long j2 = this.f36687b - xhVar2.f36687b;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sbA = sf.a(com.ironsource.sdk.constants.a.i.f17748d);
        sbA.append(this.f36687b);
        sbA.append(", ");
        sbA.append(this.f36688c);
        sbA.append(com.ironsource.sdk.constants.a.i.f17749e);
        return sbA.toString();
    }
}
