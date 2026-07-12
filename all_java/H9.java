package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class H9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2402z8 f24987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24988b;

    public H9(InterfaceC2402z8 interfaceC2402z8) {
        this(interfaceC2402z8, null);
    }

    public long a(String str, long j2) {
        return this.f24987a.a(str, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends H9> T b(String str, String str2) {
        synchronized (this) {
            this.f24987a.a(str, str2);
        }
        return this;
    }

    protected C2383ye c(String str) {
        return new C2383ye(str, this.f24988b);
    }

    String d(String str) {
        return this.f24987a.b(str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T e(String str) {
        synchronized (this) {
            this.f24987a.b(str);
        }
        return this;
    }

    public H9(InterfaceC2402z8 interfaceC2402z8, String str) {
        this.f24987a = interfaceC2402z8;
        this.f24988b = str;
    }

    public int a(String str, int i2) {
        return this.f24987a.a(str, i2);
    }

    public Set<String> d() {
        return this.f24987a.a();
    }

    public String a(String str, String str2) {
        return this.f24987a.b(str, str2);
    }

    public boolean a(String str, boolean z) {
        return this.f24987a.b(str, z);
    }

    public void c() {
        synchronized (this) {
            this.f24987a.b();
        }
    }

    List<String> a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String strB = this.f24987a.b(str, (String) null);
        if (!TextUtils.isEmpty(strB)) {
            try {
                JSONArray jSONArray = new JSONArray(strB);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, long j2) {
        synchronized (this) {
            this.f24987a.b(str, j2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends H9> T b(String str, int i2) {
        synchronized (this) {
            this.f24987a.b(str, i2);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends H9> T b(String str, boolean z) {
        synchronized (this) {
            this.f24987a.a(str, z);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends H9> T b(String str, List<String> list) {
        String string;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f24987a.a(str, string);
        return this;
    }

    public boolean b(String str) {
        return this.f24987a.a(str);
    }
}
