package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzbtv {
    public final boolean zza;
    public final String zzb;

    public zzbtv(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbtv zza(JSONObject jSONObject) {
        return new zzbtv(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
