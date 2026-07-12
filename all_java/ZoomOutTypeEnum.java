package com.mbridge.msdk.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum ZoomOutTypeEnum {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);

    private int index;

    ZoomOutTypeEnum(int i2) {
        this.index = i2;
    }

    public final int getIndex() {
        return this.index;
    }
}
