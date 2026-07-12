package com.unity3d.services.core.timer;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface IBaseTimer {
    void kill();

    boolean pause();

    boolean resume();

    void start(ScheduledExecutorService scheduledExecutorService);

    void stop();
}
