package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationManager f24809a;

    public F(Context context) {
        this((LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION));
    }

    public List<String> a() {
        List<String> providers;
        LocationManager locationManager = this.f24809a;
        List<String> listEmptyList = Collections.emptyList();
        if (locationManager != null) {
            try {
                providers = locationManager.getProviders(true);
            } catch (Throwable unused) {
                providers = null;
            }
        } else {
            providers = null;
        }
        return providers == null ? listEmptyList : providers;
    }

    F(LocationManager locationManager) {
        this.f24809a = locationManager;
    }
}
