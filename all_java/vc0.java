package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class vc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f36043a = TimeUnit.MINUTES.toMillis(2);

    vc0() {
    }

    private static boolean a(Location location, Location location2) {
        boolean zEquals;
        long time = location.getTime() - location2.getTime();
        long j2 = f36043a;
        boolean z = time > j2;
        boolean z2 = time < (-j2);
        boolean z3 = time > 0;
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        if (provider == null) {
            zEquals = provider2 == null;
        } else {
            zEquals = provider.equals(provider2);
        }
        if (z) {
            return true;
        }
        if (!z2) {
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (z3 && !z6 && zEquals) {
                return true;
            }
        }
        return false;
    }

    static boolean b(Location location, Location location2) {
        return location2 == null || a(location, location2);
    }
}
