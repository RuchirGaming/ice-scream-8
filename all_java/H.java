package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f24963b;

    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public H(a aVar, Boolean bool) {
        this.f24962a = aVar;
        this.f24963b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h2 = (H) obj;
        if (this.f24962a != h2.f24962a) {
            return false;
        }
        Boolean bool = this.f24963b;
        if (bool != null) {
            return bool.equals(h2.f24963b);
        }
        return h2.f24963b == null;
    }

    public int hashCode() {
        a aVar = this.f24962a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f24963b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
