package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;
    static Segment next;

    private SegmentPool() {
    }

    static Segment take() {
        synchronized (SegmentPool.class) {
            Segment segment = next;
            if (segment != null) {
                next = segment.next;
                segment.next = null;
                byteCount -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return segment;
            }
            return new Segment();
        }
    }

    static void recycle(Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException();
        }
        if (segment.shared) {
            return;
        }
        synchronized (SegmentPool.class) {
            long j2 = byteCount;
            if (j2 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                return;
            }
            byteCount = j2 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            segment.next = next;
            segment.limit = 0;
            segment.pos = 0;
            next = segment;
        }
    }
}
