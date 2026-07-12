package com.applovin.exoplayer2.l;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class aj {
    public static boolean a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean f(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return g(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static String c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }
}
