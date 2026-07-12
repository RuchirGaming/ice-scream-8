package com.yandex.metrica.gpllibrary;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class GplLocationCallback extends LocationCallback {
    private final LocationListener mLocationListener;

    GplLocationCallback(LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.mLocationListener.onLocationChanged(locationResult.getLastLocation());
    }
}
