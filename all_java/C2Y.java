package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2Y, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C2Y {
    public static TypedValue A00;
    public static final Object A01 = new Object();

    public static final Drawable A00(Context context, int i2) {
        int resolvedId;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i2);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i2);
        }
        synchronized (A01) {
            if (A00 == null) {
                A00 = new TypedValue();
            }
            context.getResources().getValue(i2, A00, true);
            resolvedId = A00.resourceId;
        }
        return context.getResources().getDrawable(resolvedId);
    }
}
