package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f18524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f18525b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f18524a == null) {
            f18524a = new IronSourceQaProperties();
        }
        return f18524a;
    }

    public static boolean isInitialized() {
        return f18524a != null;
    }

    public Map<String, String> getParameters() {
        return f18525b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f18525b.put(str, str2);
    }
}
