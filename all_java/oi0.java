package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class oi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f33502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f33503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f33504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f33505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AdImpressionData f33506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f33507g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f33509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f33510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f33511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<String> f33512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private AdImpressionData f33513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f33514g;

        public a(String str, HashMap map) {
            this.f33508a = str;
            this.f33509b = map;
        }

        public final oi0 a() {
            return new oi0(this, 0);
        }

        public final a b(ArrayList arrayList) {
            this.f33511d = arrayList;
            return this;
        }

        public final a c(ArrayList arrayList) {
            this.f33510c = arrayList;
            return this;
        }

        public final a a(ArrayList arrayList) {
            this.f33512e = arrayList;
            return this;
        }

        public final void a(AdImpressionData adImpressionData) {
            this.f33513f = adImpressionData;
        }

        public final void a(HashMap map) {
            this.f33514g = map;
        }
    }

    /* synthetic */ oi0(a aVar, int i2) {
        this(aVar);
    }

    public final AdImpressionData a() {
        return this.f33506f;
    }

    public final List<String> b() {
        return this.f33505e;
    }

    public final String c() {
        return this.f33501a;
    }

    public final Map<String, String> d() {
        return this.f33507g;
    }

    public final List<String> e() {
        return this.f33504d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oi0.class != obj.getClass()) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        if (!this.f33501a.equals(oi0Var.f33501a) || !this.f33502b.equals(oi0Var.f33502b)) {
            return false;
        }
        List<String> list = this.f33503c;
        if (list == null ? oi0Var.f33503c != null : !list.equals(oi0Var.f33503c)) {
            return false;
        }
        List<String> list2 = this.f33504d;
        if (list2 == null ? oi0Var.f33504d != null : !list2.equals(oi0Var.f33504d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f33506f;
        if (adImpressionData == null ? oi0Var.f33506f != null : !adImpressionData.equals(oi0Var.f33506f)) {
            return false;
        }
        Map<String, String> map = this.f33507g;
        if (map == null ? oi0Var.f33507g != null : !map.equals(oi0Var.f33507g)) {
            return false;
        }
        List<String> list3 = this.f33505e;
        if (list3 != null) {
            return list3.equals(oi0Var.f33505e);
        }
        return oi0Var.f33505e == null;
    }

    public final List<String> f() {
        return this.f33503c;
    }

    public final Map<String, String> g() {
        return this.f33502b;
    }

    public final int hashCode() {
        int iHashCode = (this.f33502b.hashCode() + (this.f33501a.hashCode() * 31)) * 31;
        List<String> list = this.f33503c;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f33504d;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f33505e;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f33506f;
        int iHashCode5 = (iHashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        Map<String, String> map = this.f33507g;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    private oi0(a aVar) {
        this.f33501a = aVar.f33508a;
        this.f33502b = aVar.f33509b;
        this.f33503c = aVar.f33510c;
        this.f33504d = aVar.f33511d;
        this.f33505e = aVar.f33512e;
        this.f33506f = aVar.f33513f;
        this.f33507g = aVar.f33514g;
    }
}
