package io.bidmachine.banner;

import com.amazon.device.ads.DtbConstants;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public enum BannerSize {
    Size_320x50(DtbConstants.DEFAULT_PLAYER_WIDTH, 50),
    Size_300x250(LogSeverity.NOTICE_VALUE, 250),
    Size_728x90(728, 90);

    public final int height;
    public final int width;

    BannerSize(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}
