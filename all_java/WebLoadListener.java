package com.mbridge.msdk.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface WebLoadListener {
    void onFailed(String str, int i2, int i3, int i4, String str2, String str3);

    void onProgress(String str, int i2, int i3, int i4, String str2, String str3);

    void onSucess(String str, int i2, int i3, int i4, String str2, String str3);
}
