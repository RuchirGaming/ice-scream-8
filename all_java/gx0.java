package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class gx0 extends Exception implements dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31154b;

    static {
        gx0$$ExternalSyntheticLambda0 gx0__externalsyntheticlambda0 = new dh.a() { // from class: com.yandex.mobile.ads.impl.gx0$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.dh.a
            public final dh fromBundle(Bundle bundle) {
                return new gx0(bundle);
            }
        };
    }

    protected gx0(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, gx0.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    protected gx0(String str, Throwable th, int i2, long j2) {
        super(str, th);
        this.f31153a = i2;
        this.f31154b = j2;
    }

    protected static String a(int i2) {
        return Integer.toString(i2, 36);
    }
}
