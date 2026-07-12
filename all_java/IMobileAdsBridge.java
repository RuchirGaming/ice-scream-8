package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface IMobileAdsBridge {
    ScarAdapterVersion getAdapterVersion(int i2);

    Object getInitializationStatus();

    int getVersionCodeIndex();

    String getVersionMethodName();

    String getVersionString();

    void initialize(Context context, Object obj);

    boolean shouldInitialize();
}
