package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class Jm<T> implements Callable<T> {
    public abstract T a() throws Exception;

    @Override // java.util.concurrent.Callable
    public T call() {
        try {
            return a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
