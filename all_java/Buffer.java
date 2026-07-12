package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public abstract class Buffer {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean isDecodeOnly() {
        return getFlag(Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final void setFlags(int i2) {
        this.flags = i2;
    }

    public final void addFlag(int i2) {
        this.flags = i2 | this.flags;
    }

    public final void clearFlag(int i2) {
        this.flags = (~i2) & this.flags;
    }

    protected final boolean getFlag(int i2) {
        return (this.flags & i2) == i2;
    }
}
