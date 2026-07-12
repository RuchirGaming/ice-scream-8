package com.google.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface InstanceCreator<T> {
    T createInstance(Type type);
}
