package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class po1 {
    public static int a(TypedArray typedArray) {
        int i2 = typedArray.getInt(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1);
        int[] iArrB = q6.b(3);
        if (i2 < 0 || i2 >= iArrB.length) {
            return 0;
        }
        return iArrB[i2];
    }
}
