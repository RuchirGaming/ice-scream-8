package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1820c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26650b;

    public C1820c4(String str, String str2) {
        this.f26649a = str;
        this.f26650b = str2;
    }

    public String a() {
        return this.f26650b;
    }

    public String b() {
        return this.f26649a;
    }

    public String c() {
        return this.f26649a + "_" + U2.a(this.f26650b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1820c4 c1820c4 = (C1820c4) obj;
        String str = this.f26649a;
        if (str == null ? c1820c4.f26649a != null : !str.equals(c1820c4.f26649a)) {
            return false;
        }
        String str2 = this.f26650b;
        String str3 = c1820c4.f26650b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public int hashCode() {
        String str = this.f26649a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26650b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f26649a + "_" + this.f26650b;
    }
}
