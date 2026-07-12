package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j2, long j3);

    void onRequestStart(String str, long j2, int i2, Map<String, List<String>> map);
}
