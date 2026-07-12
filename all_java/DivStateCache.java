package com.yandex.div.state;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface DivStateCache {
    String getRootState(String str);

    String getState(String str, String str2);

    void putRootState(String str, String str2);

    void putState(String str, String str2, String str3);
}
