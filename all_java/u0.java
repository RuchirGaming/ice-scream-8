package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class u0 {
    public static boolean a(String str) {
        int i2 = com.fyber.inneractive.sdk.config.f.f9122a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        return property != null && property.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash");
    }
}
