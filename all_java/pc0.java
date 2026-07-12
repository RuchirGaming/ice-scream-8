package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface pc0 {

    public interface a {
        void a(pc0 pc0Var, String str);
    }

    long a(String str);

    Set a(Set set);

    void a(int i2, String str);

    void a(a aVar);

    void a(HashSet hashSet);

    int b(int i2, String str);

    String b(String str);

    void clear();

    boolean contains(String str);

    Map<String, ?> getAll();

    boolean getBoolean(String str, boolean z);

    void putBoolean(String str, boolean z);

    void putLong(String str, long j2);

    void putString(String str, String str2);

    void remove(String str);
}
