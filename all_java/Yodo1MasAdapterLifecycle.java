package com.yodo1.mas.mediation;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface Yodo1MasAdapterLifecycle {
    void onActivityCreate(Activity activity, Bundle savedInstanceState);

    void onActivityDestroy(Activity activity);

    void onActivityPause(Activity activity);

    void onActivityResume(Activity activity);

    void onActivityStart(Activity activity);

    void onActivityStop(Activity activity);
}
