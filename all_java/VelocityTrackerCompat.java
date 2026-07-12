package androidx.core.view;

import android.view.VelocityTracker;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
@Deprecated
public final class VelocityTrackerCompat {
    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getXVelocity(i2);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getYVelocity(i2);
    }

    private VelocityTrackerCompat() {
    }
}
