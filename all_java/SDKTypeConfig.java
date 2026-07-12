package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class SDKTypeConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ISDKTypeFactory f4812a;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return f4812a;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        f4812a = iSDKTypeFactory;
    }
}
