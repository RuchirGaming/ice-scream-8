package com.explorestack.iab.mraid;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public final class MraidResizeProperties {
    public boolean allowOffscreen;
    public ViewPosition customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;

    public MraidResizeProperties() {
        this(0, 0, 0, 0, ViewPosition.TopRight, true);
    }

    public MraidResizeProperties(int i2, int i3, int i4, int i5, ViewPosition viewPosition, boolean z) {
        this.width = i2;
        this.height = i3;
        this.offsetX = i4;
        this.offsetY = i5;
        this.customClosePosition = viewPosition;
        this.allowOffscreen = z;
    }

    public String toString() {
        return "MRAIDResizeProperties{width=" + this.width + ", height=" + this.height + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", customClosePosition=" + this.customClosePosition + ", allowOffscreen=" + this.allowOffscreen + AbstractJsonLexerKt.END_OBJ;
    }
}
