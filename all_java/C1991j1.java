package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1991j1 {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j1$a */
    static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String a(int i2) {
        Map<String, Integer> map = A2.f24492a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : A2.f24492a.entrySet()) {
            if (entry.getValue().intValue() == i2) {
                arrayList.add(entry.getKey());
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        return arrayList.size() != 0 ? String.format("One of %s", arrayList) : "unknown";
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
