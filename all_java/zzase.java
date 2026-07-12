package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface zzase {
    String zze(Context context, String str, View view);

    String zzf(Context context, String str, View view, Activity activity);

    String zzg(Context context);

    String zzh(Context context, View view, Activity activity);

    void zzk(MotionEvent motionEvent);

    @Deprecated
    void zzl(int i2, int i3, int i4);

    void zzn(StackTraceElement[] stackTraceElementArr);

    void zzo(View view);
}
