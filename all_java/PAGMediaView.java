package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class PAGMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Integer f4866a;

    public void close() {
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(Context context) {
        super(context);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void setMrcTrackerKey(Integer num) {
        this.f4866a = num;
    }
}
