package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i2) throws InterruptedException, IOException;

    boolean advancePeekPosition(int i2, boolean z) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException;

    int read(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j2, E e2) throws Throwable;

    int skip(int i2) throws InterruptedException, IOException;

    void skipFully(int i2) throws InterruptedException, IOException;

    boolean skipFully(int i2, boolean z) throws InterruptedException, IOException;
}
