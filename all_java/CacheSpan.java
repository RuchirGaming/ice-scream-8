package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastAccessTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j2, long j3) {
        this(str, j2, j3, C.TIME_UNSET, null);
    }

    public CacheSpan(String str, long j2, long j3, long j4, File file) {
        this.key = str;
        this.position = j2;
        this.length = j3;
        this.isCached = file != null;
        this.file = file;
        this.lastAccessTimestamp = j4;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j2 = this.position - cacheSpan.position;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }
}
