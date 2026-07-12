package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.ironsource.sdk.constants.a;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
    public static final int FLAG_ALLOW_GZIP = 1;
    public final long absoluteStreamPosition;
    public final int flags;
    public final String key;
    public final long length;
    public final long position;
    public final byte[] postBody;
    public final Uri uri;

    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public DataSpec(Uri uri, int i2) {
        this(uri, 0L, -1L, null, i2);
    }

    public DataSpec(Uri uri, long j2, long j3, String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    public DataSpec(Uri uri, long j2, long j3, String str, int i2) {
        this(uri, j2, j2, j3, str, i2);
    }

    public DataSpec(Uri uri, long j2, long j3, long j4, String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public DataSpec(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = true;
        Assertions.checkArgument(j2 >= 0);
        Assertions.checkArgument(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.uri = uri;
        this.postBody = bArr;
        this.absoluteStreamPosition = j2;
        this.position = j3;
        this.length = j4;
        this.key = str;
        this.flags = i2;
    }

    public final boolean isFlagSet(int i2) {
        return (this.flags & i2) == i2;
    }

    public final String toString() {
        return "DataSpec[" + this.uri + ", " + Arrays.toString(this.postBody) + ", " + this.absoluteStreamPosition + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + a.i.f17749e;
    }

    public final DataSpec subrange(long j2) {
        long j3 = this.length;
        return subrange(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public final DataSpec subrange(long j2, long j3) {
        return (j2 == 0 && this.length == j3) ? this : new DataSpec(this.uri, this.postBody, this.absoluteStreamPosition + j2, this.position + j2, j3, this.key, this.flags);
    }

    public final DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.postBody, this.absoluteStreamPosition, this.position, this.length, this.key, this.flags);
    }
}
