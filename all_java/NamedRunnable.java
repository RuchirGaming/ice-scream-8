package com.yandex.div.internal.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class NamedRunnable implements Runnable {
    private final String mThreadSuffix;

    public abstract void execute();

    public NamedRunnable(String str) {
        this.mThreadSuffix = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + "-" + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
