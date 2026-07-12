package com.amazon.aps.ads;

import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class ApsAdFormatProperties {
    private static final String LOGTAG = "ApsAdFormatProperties";
    private int playerHeight;
    private int playerWidth;

    public int getPlayerHeight() {
        int i2 = this.playerHeight;
        return i2 == 0 ? DtbConstants.DEFAULT_PLAYER_HEIGHT : i2;
    }

    public int getPlayerWidth() {
        int i2 = this.playerWidth;
        return i2 == 0 ? DtbConstants.DEFAULT_PLAYER_WIDTH : i2;
    }

    private ApsAdFormatProperties(Builder builder) {
        this.playerHeight = builder.playerHeight;
        this.playerWidth = builder.playerWidth;
    }

    public static class Builder {
        private int playerHeight;
        private int playerWidth;

        public Builder setPlayerHeight(int i2) {
            this.playerHeight = i2;
            return this;
        }

        public Builder setPlayerWidth(int i2) {
            this.playerWidth = i2;
            return this;
        }

        public ApsAdFormatProperties build() {
            return new ApsAdFormatProperties(this);
        }
    }
}
