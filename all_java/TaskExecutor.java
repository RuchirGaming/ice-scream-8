package androidx.work.impl.utils.taskexecutor;

import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface TaskExecutor {
    void executeOnBackgroundThread(Runnable runnable);

    SerialExecutor getBackgroundExecutor();

    Executor getMainThreadExecutor();

    void postToMainThread(Runnable runnable);
}
