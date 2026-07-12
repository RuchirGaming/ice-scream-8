package io.bidmachine.analytics.entity;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Event {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37668b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37667a = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f37669c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Double> f37670d = new HashMap();

    public Event(String str) {
        this.f37668b = str;
    }

    public Event addDimension(String str, String str2) {
        this.f37669c.put(str, str2);
        return this;
    }

    public Event addMetric(String str, double d2) {
        this.f37670d.put(str, Double.valueOf(d2));
        return this;
    }

    public Map<String, String> getDimensions() {
        return this.f37669c;
    }

    public Map<String, Double> getMetrics() {
        return this.f37670d;
    }

    public String getName() {
        return this.f37668b;
    }

    public long getTimestamp() {
        return this.f37667a;
    }

    public Event setDimensions(Map<String, String> map) {
        this.f37669c.clear();
        this.f37669c.putAll(map);
        return this;
    }

    public Event setMetrics(Map<String, Double> map) {
        this.f37670d.clear();
        this.f37670d.putAll(map);
        return this;
    }
}
