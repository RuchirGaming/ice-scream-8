package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class AbstractC2142p2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f27758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27760c;

    public AbstractC2142p2(Context context, String str, String str2) {
        this.f27758a = context;
        this.f27759b = str;
        this.f27760c = str2;
    }

    public T a() {
        int identifier = this.f27758a.getResources().getIdentifier(this.f27759b, this.f27760c, this.f27758a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    protected abstract T a(int i2);
}
