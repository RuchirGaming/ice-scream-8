package com.yandex.metrica.impl.ob;

import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class C2173q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27892b;

    C2173q8() {
    }

    public void a(String str) {
        this.f27891a = str;
    }

    public void b(String str) {
        this.f27892b = str;
    }

    public String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f27891a;
            if (str == null) {
                str = "";
            }
            return Base64.encodeToString(jSONObject.put("arg_ee", str).put("arg_hv", this.f27892b).toString().getBytes(), 0);
        } catch (Throwable unused) {
            return "";
        }
    }
}
