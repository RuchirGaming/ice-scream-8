package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class zc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vc0 f37239a = new vc0();

    public final Location a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f37239a.getClass();
            if (vc0.b(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
