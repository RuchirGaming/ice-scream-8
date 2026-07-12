package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class im {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f31644a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f31645b = new ArrayList();

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f31645b));
    }

    public static void a(im imVar, long j2) {
        Long lValueOf = Long.valueOf(j2);
        HashMap map = imVar.f31644a;
        lValueOf.getClass();
        map.put("exo_len", lValueOf);
        imVar.f31645b.remove("exo_len");
    }

    public static void a(im imVar, Uri uri) {
        if (uri == null) {
            imVar.f31645b.add("exo_redir");
            imVar.f31644a.remove("exo_redir");
            return;
        }
        String string = uri.toString();
        HashMap map = imVar.f31644a;
        string.getClass();
        map.put("exo_redir", string);
        imVar.f31645b.remove("exo_redir");
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap(this.f31644a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
