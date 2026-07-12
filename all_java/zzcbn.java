package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class zzcbn {
    protected static final zzful zza = zzful.zzb(4000);

    static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void zze(String str) {
        if (zzm(3)) {
            if (str == null || str.length() <= 4000) {
                Log.d(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.d(AdRequest.LOGTAG, str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzg(String str) {
        if (zzm(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.e(AdRequest.LOGTAG, str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzi(String str) {
        if (zzm(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.i(AdRequest.LOGTAG, str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzj(String str) {
        if (zzm(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.w(AdRequest.LOGTAG, str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i2) {
        return i2 >= 5 || Log.isLoggable(AdRequest.LOGTAG, i2);
    }
}
