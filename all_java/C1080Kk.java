package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1080Kk {
    public static int A00;
    public static byte[] A01;
    public static volatile EnumC1079Kj A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, 25, 15, 18, 20, 25, 48, 28, 19, 20, 27, 24, 14, 9, 83, 5, 16, 17, 119, 115, 116, 73, 126, 113, 76, 127, 104, 105, 115, 117, 116, 2, 4, 18, 4, 90, 4, 19, 28};
    }

    static {
        A07();
        A00 = -1;
        A02 = EnumC1079Kj.A04;
    }

    public static int A01(Context context) {
        if (A02 == EnumC1079Kj.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int A05(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(32, 8, 77))) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (xmlPullParser.getAttributeName(i2).equals(A06(19, 13, 32))) {
                        int i3 = Integer.parseInt(xmlPullParser.getAttributeValue(i2));
                        return i3;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != EnumC1079Kj.A04) {
            return;
        }
        A02 = EnumC1079Kj.A03;
        Executors.newSingleThreadExecutor().execute(new U1(context));
    }

    public static boolean A0A() {
        return A02 == EnumC1079Kj.A02;
    }
}
