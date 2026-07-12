package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys1 f32256a = new ys1();

    public final String a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f32256a.getClass();
        xmlPullParser.require(2, null, "VerificationParameters");
        this.f32256a.getClass();
        String strC = ys1.c(xmlPullParser);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return strC;
    }
}
