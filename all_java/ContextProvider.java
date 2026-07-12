package io.bidmachine;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface ContextProvider {
    Activity getActivity();

    Context getApplicationContext();

    Context getContext();
}
