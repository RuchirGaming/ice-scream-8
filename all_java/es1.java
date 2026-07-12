package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class es1 {
    es1() {
    }

    static Rect a(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i2 = -iArr[0];
        int i3 = -iArr[1];
        rect.offset(i2, i3);
        return rect;
    }
}
