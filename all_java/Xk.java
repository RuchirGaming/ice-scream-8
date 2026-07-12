package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26308c = a();

    public Xk(int i2, String str) {
        this.f26306a = i2;
        this.f26307b = str;
    }

    private int a() {
        return (this.f26306a * 31) + this.f26307b.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Xk.class != obj.getClass()) {
            return false;
        }
        Xk xk = (Xk) obj;
        if (this.f26306a != xk.f26306a) {
            return false;
        }
        return this.f26307b.equals(xk.f26307b);
    }

    public int hashCode() {
        return this.f26308c;
    }
}
