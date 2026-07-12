package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Ml implements InterfaceC2036kl {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2036kl
    public void a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
