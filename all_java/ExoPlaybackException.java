package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final int rendererIndex;
    public final int type;

    public @interface Type {
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i2) {
        return new ExoPlaybackException(1, null, exc, i2);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    private ExoPlaybackException(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.type = i2;
        this.rendererIndex = i3;
    }

    public final IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) getCause();
    }

    public final Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) getCause();
    }

    public final RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) getCause();
    }
}
