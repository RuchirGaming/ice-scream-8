package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ww implements db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RectF f36560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36561b;

    public ww(int i2, RectF rectF) {
        this.f36561b = i2;
        this.f36560a = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.db0
    public final String a() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f36561b);
        RectF rectF = this.f36560a;
        objArr[1] = rectF != null ? String.format("{x:%s,y:%s,width:%s,height:%s}", Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())) : null;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", objArr);
    }
}
