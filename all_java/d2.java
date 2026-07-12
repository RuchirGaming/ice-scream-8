package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Click.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f14139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f14145i;

    public d2(int i2, String url, Map<String, String> map, boolean z, boolean z2, int i3, long j2, long j3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f14137a = i2;
        this.f14138b = url;
        this.f14139c = map;
        this.f14140d = z;
        this.f14141e = z2;
        this.f14142f = i3;
        this.f14143g = j2;
        this.f14144h = j3;
        this.f14145i = new AtomicBoolean(false);
    }

    public final boolean a(long j2) {
        return System.currentTimeMillis() - this.f14144h > j2 * ((long) 1000);
    }

    public /* synthetic */ d2(int i2, String str, Map map, boolean z, boolean z2, int i3, long j2, long j3, int i4) {
        this((i4 & 1) != 0 ? new Random().nextInt() & Integer.MAX_VALUE : i2, str, (i4 & 4) != 0 ? null : map, z, z2, i3, (i4 & 64) != 0 ? System.currentTimeMillis() : j2, (i4 & 128) != 0 ? System.currentTimeMillis() : j3);
    }
}
