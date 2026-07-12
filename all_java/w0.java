package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class w0 {
    public static void a(UnitDisplayType unitDisplayType, q0 q0Var, int i2, int i3, int i4, int i5) {
        if (i2 > 0 && i3 > 0) {
            float f2 = i2;
            float f3 = i3;
            float f4 = f2 / f3;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                i4 = (int) (i5 * f4);
            } else {
                if (Math.abs(f4 - 1.7777778f) >= 0.1f) {
                    Math.abs(f4 - 1.3333334f);
                }
                float fMin = Math.min(i4 / f2, 10.0f);
                float f5 = i5;
                float f6 = fMin * f3;
                if (f5 > f6) {
                    i4 = (int) (fMin * f2);
                    i5 = (int) f6;
                } else {
                    float fMin2 = Math.min(f5 / f3, 10.0f);
                    i4 = (int) (f2 * fMin2);
                    i5 = (int) (fMin2 * f3);
                }
            }
        }
        q0Var.f12196a = i4;
        q0Var.f12197b = i5;
    }
}
