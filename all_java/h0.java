package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static h0 f16429c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f16430a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f16431b = new ConcurrentHashMap<>();

    h0() {
    }

    public static synchronized h0 b() {
        if (f16429c == null) {
            f16429c = new h0();
        }
        return f16429c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f16430a;
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f16430a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f16431b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f16430a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f16431b;
    }

    public void d() {
        synchronized (this) {
            this.f16430a.clear();
        }
    }
}
