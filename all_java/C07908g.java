package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C07908g implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"SDO1JVQRVztc05U6wH4HJTiF5V86WLZV", "JUkWBi3mNnUEcI1zFAO0icxdG8wRWdD7", "QP9Vd5zf9OYRCERvVtyUemXpYBL6EKiE", "xOOYiIXMxQksUvny4QEKcKXl4UDniIsU", "x87Ktc1IWjLpjjicmuhI7Z2IzrOHGBC3", "WGZ", "wfI1QUU7hCcnQ3hBelCxr5juQnjBiotI", "E2gfbhu1TU9ChELgnqQ3ne7CNBbav8TU"};
    public C07918h A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A04[5].length() != 3) {
                throw new RuntimeException();
            }
            A04[6] = "pH7cradwiFTKLrbheOx3UovjSmwH9sX8";
            bArrCopyOfRange[i5] = (byte) ((b2 ^ i4) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 105, 110, 111, 115, 110, 90, 117, 112, 121, 60, 117, 111, 60, 125, 112, 110, 121, 125, 120, 101, 60, 127, 112, 115, 111, 121, 120, 15, 40, 48, 39, 42, 47, 34, 102, 54, 41, 53, 47, 50, 47, 41, 40, 124, 102, 110, 99, 34, 106, 99, 34, 111, 94, 91, 95};
    }

    static {
        A02();
    }

    public C07908g(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A00(53, 3, 10));
        this.A02 = randomAccessFile;
        if (randomAccessFile.length() != 8) {
            randomAccessFile.setLength(8L);
            this.A00 = new C07918h(0, 0);
            A01();
            return;
        }
        int i2 = randomAccessFile.readInt();
        int fileIdx = randomAccessFile.readInt();
        if (i2 < 0 || fileIdx < 0) {
            i2 = 0;
            fileIdx = 0;
        }
        this.A00 = new C07918h(i2, fileIdx);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C07918h A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 58));
    }

    public final void A04(C07918h c07918h) throws IOException {
        if (!this.A01) {
            if (c07918h.A02() >= 0 && c07918h.A03() >= 0) {
                this.A00 = c07918h;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 96), Integer.valueOf(c07918h.A02()), Integer.valueOf(c07918h.A03())));
        }
        throw new IOException(A00(0, 28, 58));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
