package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1070Ka {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (context.getApplicationInfo().targetSdkVersion >= 34) {
            return context.registerReceiver(broadcastReceiver, intentFilter, z ? 2 : 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
