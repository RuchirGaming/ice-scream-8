package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C07958m {
    public static byte[] A01;
    public final File A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-90, -60, -47, -47, -46, -41, -125, -56, -47, -42, -40, -43, -56, -125, -118, -120, -42, -118, -125, -52, -42, -125, -60, -125, -57, -52, -43, -56, -58, -41, -46, -43, -36, -118, -91, -83, -80, -87, -88, 100, -72, -77, 100, -89, -74, -87, -91, -72, -87, 100, -88, -83, -74, -87, -89, -72, -77, -74, -67, 100, 107, 105, -73, 107, -58, -62, -45, -60, -53, -65, -52, -49, -57};
    }

    public C07958m(File file) {
        this.A00 = file;
    }

    public static C07958m A00(String str, Context context) throws IOException {
        File filesDir = new File(context.getFilesDir(), A01(64, 9, 55));
        A03(filesDir);
        File fbsdklogDir = new File(filesDir, str);
        A03(fbsdklogDir);
        return new C07958m(fbsdklogDir);
    }

    public static void A03(File file) throws IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            }
            final String str = String.format(Locale.US, A01(0, 33, 58), file.getCanonicalPath());
            throw new RuntimeException(str) { // from class: com.facebook.ads.redexgen.X.8n
            };
        }
        final String str2 = String.format(Locale.US, A01(33, 31, 27), file.getCanonicalPath());
        throw new RuntimeException(str2) { // from class: com.facebook.ads.redexgen.X.8n
        };
    }

    public final C07958m A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new C07958m(file);
    }

    public final File A05() {
        return this.A00;
    }
}
