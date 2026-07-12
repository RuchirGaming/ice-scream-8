package androidx.webkit.internal;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ConditionallySupportedFeature {
    String getPublicFeatureName();

    boolean isSupported();
}
