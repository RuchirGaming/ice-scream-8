package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzfet {
    private final JSONObject zza;

    public zzfet(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzb() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int zzb() {
        int iOptInt = this.zza.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
