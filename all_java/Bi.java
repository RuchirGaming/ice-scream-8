package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Pair<String, String>> f24591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f24592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f24593f;

    public enum a {
        WIFI,
        CELL
    }

    public Bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l2, List<a> list2) {
        this.f24588a = str;
        this.f24589b = str2;
        this.f24590c = str3;
        this.f24591d = Collections.unmodifiableList(list);
        this.f24592e = l2;
        this.f24593f = list2;
    }
}
