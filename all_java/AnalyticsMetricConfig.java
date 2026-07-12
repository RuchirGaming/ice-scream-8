package io.bidmachine.analytics.entity;

import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class AnalyticsMetricConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f37665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f37666c;

    public AnalyticsMetricConfig(String str, List<String> list, List<String> list2) {
        this.f37664a = str;
        this.f37665b = list;
        this.f37666c = list2;
    }

    public List<String> getDimensions() {
        return this.f37665b;
    }

    public String getEventName() {
        return this.f37664a;
    }

    public List<String> getMetrics() {
        return this.f37666c;
    }
}
