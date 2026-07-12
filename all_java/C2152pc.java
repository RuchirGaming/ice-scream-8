package com.yandex.metrica.impl.ob;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2152pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, C1778ac.a> f27795a;

    static {
        HashMap map = new HashMap();
        map.put(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, C1778ac.a.GOOGLE);
        map.put("huawei", C1778ac.a.HMS);
        map.put("yandex", C1778ac.a.YANDEX);
        f27795a = Collections.unmodifiableMap(map);
    }
}
