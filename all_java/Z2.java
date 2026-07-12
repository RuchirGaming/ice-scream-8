package com.yandex.metrica.impl.ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f26390e;

    public Z2(String str, String str2, boolean z, int i2, Long l2) {
        this.f26386a = str;
        this.f26387b = str2;
        this.f26388c = z;
        this.f26389d = i2;
        this.f26390e = l2;
    }

    public static JSONArray a(Collection<Z2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (Z2 z2 : collection) {
                z2.getClass();
                JSONObject jSONObjectPut = null;
                try {
                    jSONObjectPut = new JSONObject().put("mac", z2.f26386a).put("ssid", z2.f26387b).put("signal_strength", z2.f26389d).put("is_connected", z2.f26388c).put("last_visible_offset_seconds", z2.f26390e);
                } catch (Throwable unused) {
                }
                if (jSONObjectPut != null) {
                    jSONArray.put(jSONObjectPut);
                }
            }
        }
        return jSONArray;
    }
}
