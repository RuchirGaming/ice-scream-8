package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.monetization.ads.video.models.ad.JavaScriptResource;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class za0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys1 f37222a = new ys1();

    public final JavaScriptResource a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f37222a.getClass();
        xmlPullParser.require(2, null, "JavaScriptResource");
        this.f37222a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f37222a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "browserOptional");
        Boolean boolValueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        this.f37222a.getClass();
        String strC = ys1.c(xmlPullParser);
        if (TextUtils.isEmpty(attributeValue) || boolValueOf == null || TextUtils.isEmpty(strC)) {
            return null;
        }
        return new JavaScriptResource(attributeValue, strC, boolValueOf.booleanValue());
    }
}
