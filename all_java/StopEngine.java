package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface StopEngine {
    String debug(String str, float f2);

    float getInterpolation(float f2);

    float getVelocity();

    float getVelocity(float f2);

    boolean isStopped();
}
