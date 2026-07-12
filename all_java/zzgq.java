package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class zzgq {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzgq() {
    }

    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgq.class) {
            if (zzb) {
                return true;
            }
            boolean zZzd = zzd(context);
            if (zZzd) {
                zzb = zZzd;
            }
            return zZzd;
        }
    }

    private static boolean zzd(Context context) {
        boolean z;
        boolean z2 = true;
        int i2 = 1;
        while (true) {
            z = false;
            if (i2 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
                break;
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                zza = null;
                i2++;
            }
        }
        if (z) {
            zza = null;
        }
        return z;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
