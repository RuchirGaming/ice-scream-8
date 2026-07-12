package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1071Kb {
    public static Intent A00(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1070Ka.A00(context, broadcastReceiver, intentFilter, z);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
