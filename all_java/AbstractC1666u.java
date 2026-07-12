package com.unity3d.player;

import android.util.Log;

/* JADX INFO: renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
abstract class AbstractC1666u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static boolean f24155a = false;

    protected static void Log(int i2, String str) {
        if (f24155a) {
            return;
        }
        if (i2 == 6) {
            Log.e("Unity", str);
        }
        if (i2 == 5) {
            Log.w("Unity", str);
        }
    }
}
