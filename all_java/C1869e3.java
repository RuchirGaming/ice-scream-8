package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class C1869e3 extends Location {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26769a;

    private C1869e3(Location location, String str) {
        super(location);
        this.f26769a = str;
    }

    public static C1869e3 b(Location location) {
        return new C1869e3(new Location(location), "");
    }

    public String a() {
        return this.f26769a;
    }

    public static C1869e3 a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C1869e3(location2, provider);
    }
}
