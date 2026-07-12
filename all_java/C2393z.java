package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2393z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, a> f28617a = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        UNDEFINED,
        RESUMED,
        PAUSED
    }

    public boolean a(Activity activity, a aVar) {
        if (activity != null && this.f28617a.get(activity) == aVar) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f28617a.put(activity, aVar);
        return true;
    }
}
