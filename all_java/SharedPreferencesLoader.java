package cn.thinkinganalyticsclone.android;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class SharedPreferencesLoader {
    private final Executor mExecutor = Executors.newSingleThreadExecutor();

    public Future<SharedPreferences> loadPreferences(Context context, String name) {
        FutureTask futureTask = new FutureTask(new LoadSharedPreferences(context, name));
        this.mExecutor.execute(futureTask);
        return futureTask;
    }

    private static class LoadSharedPreferences implements Callable<SharedPreferences> {
        private final Context mContext;
        private final String mPrefsName;

        public LoadSharedPreferences(Context context, String prefsName) {
            this.mContext = context;
            this.mPrefsName = prefsName;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public SharedPreferences call() {
            return this.mContext.getSharedPreferences(this.mPrefsName, 0);
        }
    }
}
