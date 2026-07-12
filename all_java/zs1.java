package com.yandex.mobile.ads.impl;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class zs1 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (xmlPullParser.getEventType() == 2) && xmlPullParser.getName().equals(str);
    }
}
