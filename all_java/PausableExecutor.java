package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface PausableExecutor extends Executor {
    boolean isPaused();

    void pause();

    void resume();
}
