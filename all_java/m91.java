package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class m91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys1 f32793a = new ys1();

    m91() {
    }

    final Integer a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer numValueOf;
        this.f32793a.getClass();
        xmlPullParser.require(2, null, "Ad");
        try {
            numValueOf = Integer.valueOf(xmlPullParser.getAttributeValue(null, "sequence"));
        } catch (NumberFormatException unused) {
            int i2 = ga0.f30971a;
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }
}
