package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class AbstractC2053ld<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f27544e = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC1930ge f27546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final LocationListener f27547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Looper f27548d;

    public AbstractC2053ld(Context context, LocationListener locationListener, InterfaceC1930ge interfaceC1930ge, Looper looper) {
        this.f27545a = context;
        this.f27547c = locationListener;
        this.f27546b = interfaceC1930ge;
        this.f27548d = looper;
    }

    public abstract void a();

    public abstract boolean a(T t);

    public abstract void b();
}
