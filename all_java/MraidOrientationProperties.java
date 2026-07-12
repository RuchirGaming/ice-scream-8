package com.explorestack.iab.mraid;

import android.content.Context;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public final class MraidOrientationProperties {
    public static final int FORCE_ORIENTATION_LANDSCAPE = 1;
    public static final int FORCE_ORIENTATION_NONE = 2;
    public static final int FORCE_ORIENTATION_PORTRAIT = 0;
    public boolean allowOrientationChange;
    public int forceOrientation;

    public MraidOrientationProperties(boolean z, int i2) {
        this.allowOrientationChange = z;
        this.forceOrientation = i2;
    }

    public static int forceOrientationFromString(String str) {
        int iIndexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i2 = this.forceOrientation;
        if (i2 == 0) {
            return "portrait";
        }
        if (i2 != 1) {
            return i2 != 2 ? "error" : "none";
        }
        return "landscape";
    }

    public int obtainTargetActivityOrientation(Context context) {
        int i2 = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i3 = this.forceOrientation;
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 0;
        }
        if (this.allowOrientationChange) {
            return -1;
        }
        return i2;
    }

    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.allowOrientationChange + ", forceOrientation=" + forceOrientationString() + AbstractJsonLexerKt.END_OBJ;
    }
}
