package com.yandex.metrica.impl.ob;

import android.util.Log;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f28734a;

    public zo(boolean z) {
        this.f28734a = false;
        this.f28734a = z;
    }

    protected abstract String a();

    public void a(String str) {
        a(6, str);
    }

    protected abstract String b();

    public void b(String str) {
        a(4, str);
    }

    public boolean c() {
        return this.f28734a;
    }

    public void d() {
        this.f28734a = false;
    }

    public void e() {
        this.f28734a = true;
    }

    protected boolean f() {
        return this.f28734a;
    }

    private String d(String str, Object[] objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            return sb.toString();
        } catch (Throwable unused) {
            return a();
        }
    }

    public void a(Throwable th, String str, Object... objArr) {
        Log.println(6, b(), d(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    public void b(String str, Object... objArr) {
        Log.println(5, b(), d(str, objArr));
    }

    public void c(String str) {
        a(5, str);
    }

    public void c(String str, Object... objArr) {
        if (f()) {
            Log.println(5, b(), d(str, objArr));
        }
    }

    void a(int i2, String str) {
        if (f()) {
            String strB = b();
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.println(i2, strB, sb.toString());
        }
    }

    public void a(String str, Object... objArr) {
        if (f()) {
            Log.println(4, b(), d(str, objArr));
        }
    }

    public void a(Throwable th, String str) {
        if (this.f28734a) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a());
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb.append(sb2.toString());
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(6, MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, sb.toString());
        }
    }
}
