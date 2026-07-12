package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class NetworkConnectivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ConnectivityManager f23952a;

    public NetworkConnectivity(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f23952a = connectivityManager;
        if (connectivityManager == null) {
            AbstractC1666u.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    public void a() {
    }

    public int b() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f23952a;
        if (connectivityManager == null) {
            return 0;
        }
        if (PlatformSupport.MARSHMALLOW_SUPPORT) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = this.f23952a.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(0) ? 1 : 2;
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return activeNetworkInfo.getType() == 0 ? 1 : 2;
            }
        }
        return 0;
    }
}
