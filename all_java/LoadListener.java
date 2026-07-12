package com.mbridge.msdk.out;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public abstract class LoadListener implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract void onLoadFaild(String str);

    public abstract void onLoadSucceed();
}
