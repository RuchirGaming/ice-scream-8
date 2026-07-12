package com.mbridge.msdk.videocommon.b;

import org.json.JSONObject;

/* JADX INFO: compiled from: AdParams.java */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22913b;

    private a(String str, String str2) {
        this.f22912a = str;
        this.f22913b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("appId"), jSONObject.optString(com.ironsource.sdk.constants.a.f17633i));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
