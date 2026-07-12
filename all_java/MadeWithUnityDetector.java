package com.unity3d.services.core.properties;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class MadeWithUnityDetector {
    public static final String UNITY_PLAYER_CLASS_NAME = "com.unity3d.player.UnityPlayer";

    public static boolean isMadeWithUnity() {
        try {
            Class.forName(UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
