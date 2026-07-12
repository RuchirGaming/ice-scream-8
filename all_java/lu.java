package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class lu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys1 f32710a = new ys1();

    lu() {
    }

    final int a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f32710a.getClass();
        Long lValueOf = null;
        xmlPullParser.require(2, null, "Duration");
        this.f32710a.getClass();
        String strC = ys1.c(xmlPullParser);
        if (strC != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                lValueOf = Long.valueOf(simpleDateFormat.parse(strC).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
            }
        }
        if (lValueOf != null) {
            return lValueOf.intValue();
        }
        return 0;
    }
}
