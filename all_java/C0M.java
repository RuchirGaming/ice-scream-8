package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0M, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C0M {
    public static byte[] A00;

    static {
        A06();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{46, 33, 36, 45, 114, 103, 103};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i2) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i2 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i2 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i2, int i3) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0N c0n = new C0N(inputStream);
        c0n.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0n, null, options);
        }
        return BitmapFactory.decodeStream(c0n);
    }

    public static Bitmap A02(String str, int i2, int i3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap A03(String str, int i2, int i3, boolean z) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i2 > 0 && i3 > 0) {
                if (z) {
                    Bitmap bitmapA01 = A01(fileInputStream, i2, i3);
                    A07(fileInputStream);
                    return bitmapA01;
                }
                Bitmap bitmapA02 = A02(str, i2, i3);
                A07(fileInputStream);
                return bitmapA02;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return bitmapDecodeStream;
        } catch (Throwable th) {
            A07(null);
            throw th;
        }
    }

    public static String A05(File file) {
        if (file != null) {
            return A04(0, 7, 117) + file.getPath();
        }
        return null;
    }

    public static void A07(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
