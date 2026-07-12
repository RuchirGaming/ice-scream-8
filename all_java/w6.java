package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: MediationConfigParser.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w6 f15230a = new w6();

    public final int a(JSONObject jSONObject, String str) {
        return (str == null || !jSONObject.has(str)) ? jSONObject.getInt("default") : jSONObject.getInt(str);
    }
}
