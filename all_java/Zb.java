package com.yandex.metrica.impl.ob;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26428c;

    public Zb(JSONObject jSONObject) throws JSONException {
        this.f26426a = jSONObject.getString("name");
        this.f26428c = jSONObject.getBoolean("required");
        this.f26427b = jSONObject.optInt(MediationMetaData.KEY_VERSION, -1);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("name", this.f26426a).put("required", this.f26428c);
        int i2 = this.f26427b;
        if (i2 != -1) {
            jSONObjectPut.put(MediationMetaData.KEY_VERSION, i2);
        }
        return jSONObjectPut;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Zb.class != obj.getClass()) {
            return false;
        }
        Zb zb = (Zb) obj;
        if (this.f26427b != zb.f26427b || this.f26428c != zb.f26428c) {
            return false;
        }
        String str = this.f26426a;
        String str2 = zb.f26426a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f26426a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f26427b) * 31) + (this.f26428c ? 1 : 0);
    }

    public Zb(String str, int i2, boolean z) {
        this.f26426a = str;
        this.f26427b = i2;
        this.f26428c = z;
    }
}
