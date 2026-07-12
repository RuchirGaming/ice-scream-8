package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i2) {
        return this.handler.obtainMessage(i2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i2, Object obj) {
        return this.handler.obtainMessage(i2, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i2, int i3, int i4) {
        return this.handler.obtainMessage(i2, i3, i4);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final Message obtainMessage(int i2, int i3, int i4, Object obj) {
        return this.handler.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i2) {
        return this.handler.sendEmptyMessage(i2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i2, long j2) {
        return this.handler.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i2) {
        this.handler.removeMessages(i2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.util.HandlerWrapper
    public final boolean postDelayed(Runnable runnable, long j2) {
        return this.handler.postDelayed(runnable, j2);
    }
}
