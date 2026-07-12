package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class CalleeHandler {
    private CalleeHandler() {
    }

    static Handler create() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
