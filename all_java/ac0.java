package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<m> f28984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FalseClick f28985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28988e;

    public ac0(List<m> list, FalseClick falseClick, String str, String str2, long j2) {
        this.f28984a = list;
        this.f28985b = falseClick;
        this.f28986c = str;
        this.f28987d = str2;
        this.f28988e = j2;
    }

    public final List<m> a() {
        return this.f28984a;
    }

    public final long b() {
        return this.f28988e;
    }

    public final FalseClick c() {
        return this.f28985b;
    }

    public final String d() {
        return this.f28986c;
    }

    public final String e() {
        return this.f28987d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ac0.class != obj.getClass()) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        if (this.f28988e != ac0Var.f28988e) {
            return false;
        }
        List<m> list = this.f28984a;
        if (list == null ? ac0Var.f28984a != null : !list.equals(ac0Var.f28984a)) {
            return false;
        }
        FalseClick falseClick = this.f28985b;
        if (falseClick == null ? ac0Var.f28985b != null : !falseClick.equals(ac0Var.f28985b)) {
            return false;
        }
        String str = this.f28986c;
        if (str == null ? ac0Var.f28986c != null : !str.equals(ac0Var.f28986c)) {
            return false;
        }
        String str2 = this.f28987d;
        String str3 = ac0Var.f28987d;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public final int hashCode() {
        List<m> list = this.f28984a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        FalseClick falseClick = this.f28985b;
        int iHashCode2 = (iHashCode + (falseClick != null ? falseClick.hashCode() : 0)) * 31;
        String str = this.f28986c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28987d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.f28988e;
        return iHashCode4 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
