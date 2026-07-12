package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int i2, int i3) {
        getHolder().setFixedSize(i2, i3);
        requestLayout();
        invalidate();
    }
}
