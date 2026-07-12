package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface zzgo {
    String zza(ContentResolver contentResolver, String str) throws zzgr;

    <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgp<T> zzgpVar) throws zzgr;
}
