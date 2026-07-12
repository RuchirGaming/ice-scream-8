package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class yx extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f37081b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37083b;

        public a(String str, String str2) {
            this.f37082a = str;
            this.f37083b = str2;
        }

        public final String a() {
            return this.f37082a;
        }

        public final String b() {
            return this.f37083b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f37082a.equals(aVar.f37082a)) {
                return this.f37083b.equals(aVar.f37083b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f37083b.hashCode() + (this.f37082a.hashCode() * 31);
        }
    }

    public yx(String str, ArrayList arrayList) {
        super(str);
        this.f37081b = arrayList;
    }

    public final List<a> b() {
        return this.f37081b;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yx.class == obj.getClass() && super.equals(obj)) {
            return this.f37081b.equals(((yx) obj).f37081b);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.m
    public final int hashCode() {
        return this.f37081b.hashCode() + (super.hashCode() * 31);
    }
}
