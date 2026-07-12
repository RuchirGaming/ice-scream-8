package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    MarkableInputStream(InputStream inputStream, int i2) {
        this(inputStream, i2, 1024);
    }

    private MarkableInputStream(InputStream inputStream, int i2, int i3) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i2);
        this.limitIncrement = i3;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.defaultMark = savePosition(i2);
    }

    public long savePosition(int i2) {
        long j2 = this.offset + ((long) i2);
        if (this.limit < j2) {
            setLimit(j2);
        }
        return this.offset;
    }

    public void allowMarksToExpire(boolean z) {
        this.allowExpire = z;
    }

    private void setLimit(long j2) {
        try {
            long j3 = this.reset;
            long j4 = this.offset;
            if (j3 < j4 && j4 <= this.limit) {
                this.in.reset();
                this.in.mark((int) (j2 - this.reset));
                skip(this.reset, this.offset);
            } else {
                this.reset = j4;
                this.in.mark((int) (j2 - j4));
            }
            this.limit = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public void reset(long j2) throws IOException {
        if (this.offset > this.limit || j2 < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.in.reset();
        skip(this.reset, j2);
        this.offset = j2;
    }

    private void skip(long j2, long j3) throws IOException {
        while (j2 < j3) {
            long jSkip = this.in.skip(j3 - j2);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j2 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset + 1;
            long j3 = this.limit;
            if (j2 > j3) {
                setLimit(j3 + ((long) this.limitIncrement));
            }
        }
        int i2 = this.in.read();
        if (i2 != -1) {
            this.offset++;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset;
            if (((long) bArr.length) + j2 > this.limit) {
                setLimit(j2 + ((long) bArr.length) + ((long) this.limitIncrement));
            }
        }
        int i2 = this.in.read(bArr);
        if (i2 != -1) {
            this.offset += (long) i2;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset;
            long j3 = i3;
            if (j2 + j3 > this.limit) {
                setLimit(j2 + j3 + ((long) this.limitIncrement));
            }
        }
        int i4 = this.in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.offset += (long) i4;
        }
        return i4;
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        if (!this.allowExpire) {
            long j3 = this.offset;
            if (j3 + j2 > this.limit) {
                setLimit(j3 + j2 + ((long) this.limitIncrement));
            }
        }
        long jSkip = this.in.skip(j2);
        this.offset += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }
}
