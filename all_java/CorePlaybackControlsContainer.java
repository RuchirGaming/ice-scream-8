package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class CorePlaybackControlsContainer extends FrameLayout {
    public CorePlaybackControlsContainer(Context context) {
        super(context);
    }

    public TextView getCountDownProgress() {
        return (TextView) findViewById(R.id.video_count_down_control);
    }

    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R.id.video_mute_control);
    }

    public ProgressBar getProgressView() {
        return (ProgressBar) findViewById(R.id.video_progress_control);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
