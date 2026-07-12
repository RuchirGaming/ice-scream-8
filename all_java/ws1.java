package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ws1<T> implements xs1<List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ys1 f36524a = new ys1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xs1<T> f36527d;

    public ws1(xs1<T> xs1Var, String str, String str2) {
        this.f36527d = xs1Var;
        this.f36525b = str;
        this.f36526c = str2;
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser) throws XmlPullParserException, JSONException, IOException {
        ArrayList arrayList = new ArrayList();
        ys1 ys1Var = this.f36524a;
        String str = this.f36525b;
        ys1Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f36524a.getClass();
            if (!(xmlPullParser.next() != 3)) {
                return arrayList;
            }
            this.f36524a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (this.f36526c.equals(xmlPullParser.getName())) {
                    T tA = this.f36527d.a(xmlPullParser);
                    if (tA != null) {
                        arrayList.add(tA);
                    }
                } else {
                    this.f36524a.getClass();
                    ys1.d(xmlPullParser);
                }
            }
        }
    }
}
