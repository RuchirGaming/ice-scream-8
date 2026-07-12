package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class i0 {

    public class a extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f12174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, AtomicInteger atomicInteger) {
            super(inputStream);
            this.f12174a = atomicInteger;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4;
            i4 = super.read(bArr, i2, i3);
            if (i4 != -1) {
                this.f12174a.getAndAdd(i4);
            }
            return i4;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            this.f12174a.set(0);
            super.reset();
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized long skip(long j2) throws IOException {
            long jSkip;
            jSkip = super.skip(j2);
            this.f12174a.addAndGet((int) jSkip);
            return jSkip;
        }
    }

    public static Bitmap a(InputStream inputStream, int i2) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new a(inputStream, atomicInteger));
        if (atomicInteger.get() == i2) {
            return bitmapDecodeStream;
        }
        return null;
    }
}
