package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class qe1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet f34212c = new HashSet(Collections.singletonList("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashSet f34213d = new HashSet(Arrays.asList("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f34214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mw0 f34215b;

    qe1(Context context, LocationManager locationManager) {
        this.f34214a = locationManager;
        this.f34215b = new mw0(context);
    }

    private boolean b(String str) {
        boolean zA = this.f34215b.a();
        boolean zB = this.f34215b.b();
        boolean z = !f34212c.contains(str);
        if (f34213d.contains(str)) {
            if (z && zA && zB) {
                return true;
            }
        } else if (z && zA) {
            return true;
        }
        return false;
    }

    public final Location a(String str) {
        Location location = null;
        if (!b(str)) {
            return null;
        }
        try {
            LocationManager locationManager = this.f34214a;
            if (locationManager == null) {
                return null;
            }
            Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            try {
                int i2 = ga0.f30971a;
                return lastKnownLocation;
            } catch (Throwable unused) {
                location = lastKnownLocation;
            }
        } catch (Throwable unused2) {
        }
        int i3 = ga0.f30971a;
        return location;
    }
}
