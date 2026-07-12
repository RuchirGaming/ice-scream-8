package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Integer> f24774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f24775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f24778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f24779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f24780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24781j;

    public Ei(long j2, String str, List<Integer> list, List<Integer> list2, long j3, int i2, long j4, long j5, long j6, long j7) {
        this.f24772a = j2;
        this.f24773b = str;
        this.f24774c = Collections.unmodifiableList(list);
        this.f24775d = Collections.unmodifiableList(list2);
        this.f24776e = j3;
        this.f24777f = i2;
        this.f24778g = j4;
        this.f24779h = j5;
        this.f24780i = j6;
        this.f24781j = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ei.class != obj.getClass()) {
            return false;
        }
        Ei ei = (Ei) obj;
        if (this.f24772a == ei.f24772a && this.f24776e == ei.f24776e && this.f24777f == ei.f24777f && this.f24778g == ei.f24778g && this.f24779h == ei.f24779h && this.f24780i == ei.f24780i && this.f24781j == ei.f24781j && this.f24773b.equals(ei.f24773b) && this.f24774c.equals(ei.f24774c)) {
            return this.f24775d.equals(ei.f24775d);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f24772a;
        int iHashCode = ((((((((int) (j2 ^ (j2 >>> 32))) * 31) + this.f24773b.hashCode()) * 31) + this.f24774c.hashCode()) * 31) + this.f24775d.hashCode()) * 31;
        long j3 = this.f24776e;
        int i2 = (((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f24777f) * 31;
        long j4 = this.f24778g;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f24779h;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f24780i;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f24781j;
        return i5 + ((int) ((j7 >>> 32) ^ j7));
    }

    public String toString() {
        return "SocketConfig{secondsToLive=" + this.f24772a + ", token='" + this.f24773b + "', ports=" + this.f24774c + ", portsHttp=" + this.f24775d + ", firstDelaySeconds=" + this.f24776e + ", launchDelaySeconds=" + this.f24777f + ", openEventIntervalSeconds=" + this.f24778g + ", minFailedRequestIntervalSeconds=" + this.f24779h + ", minSuccessfulRequestIntervalSeconds=" + this.f24780i + ", openRetryIntervalSeconds=" + this.f24781j + AbstractJsonLexerKt.END_OBJ;
    }
}
