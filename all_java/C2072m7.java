package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2072m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f27608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<StackTraceElement> f27609f;

    public C2072m7(String str, int i2, long j2, String str2, Integer num, List<StackTraceElement> list) {
        this.f27604a = str;
        this.f27605b = i2;
        this.f27606c = j2;
        this.f27607d = str2;
        this.f27608e = num;
        this.f27609f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
