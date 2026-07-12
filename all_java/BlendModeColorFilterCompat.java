package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class BlendModeColorFilterCompat {
    public static ColorFilter createBlendModeColorFilterCompat(int i2, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objObtainBlendModeFromCompat = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat);
            if (objObtainBlendModeFromCompat != null) {
                return Api29Impl.createBlendModeColorFilter(i2, objObtainBlendModeFromCompat);
            }
            return null;
        }
        PorterDuff.Mode modeObtainPorterDuffFromCompat = BlendModeUtils.obtainPorterDuffFromCompat(blendModeCompat);
        if (modeObtainPorterDuffFromCompat != null) {
            return new PorterDuffColorFilter(i2, modeObtainPorterDuffFromCompat);
        }
        return null;
    }

    private BlendModeColorFilterCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static ColorFilter createBlendModeColorFilter(int i2, Object obj) {
            return new BlendModeColorFilter(i2, (BlendMode) obj);
        }
    }
}
