package io.bidmachine.analytics;

import io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class AnalyticsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<AnalyticsMetricConfig> f37656f;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f37658b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37660d = 30;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37661e = 4;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37662f = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<AnalyticsMetricConfig> f37659c = new ArrayList();

        public Builder(String str, String str2) {
            this.f37657a = str;
            this.f37658b = str2;
        }

        public Builder addAnalyticsMetricConfig(AnalyticsMetricConfig analyticsMetricConfig) {
            this.f37659c.add(analyticsMetricConfig);
            return this;
        }

        public AnalyticsConfig build() {
            return new AnalyticsConfig(this.f37657a, this.f37658b, this.f37660d, this.f37661e, this.f37662f, this.f37659c);
        }

        public Builder setAnalyticsMetricConfigList(List<AnalyticsMetricConfig> list) {
            this.f37659c.clear();
            this.f37659c.addAll(list);
            return this;
        }

        public Builder setEventBatchSize(int i2) {
            return setEventBatchSize(i2, null);
        }

        public Builder setEventBatchSize(int i2, Integer num) {
            int iIntValue;
            this.f37661e = i2;
            if (num == null || num.intValue() < i2) {
                iIntValue = i2 * 2;
                if (iIntValue < 8) {
                    iIntValue = 8;
                }
            } else {
                iIntValue = num.intValue();
            }
            this.f37662f = iIntValue;
            return this;
        }

        public Builder setIntervalSec(int i2) {
            this.f37660d = i2;
            return this;
        }
    }

    private AnalyticsConfig(String str, String str2, int i2, int i3, int i4, List<AnalyticsMetricConfig> list) {
        this.f37651a = str;
        this.f37652b = str2;
        this.f37653c = ((long) i2) * 1000;
        this.f37654d = i3;
        this.f37655e = i4;
        this.f37656f = list;
    }

    public List<AnalyticsMetricConfig> getAnalyticsMetricConfigList() {
        return this.f37656f;
    }

    public String getContext() {
        return this.f37652b;
    }

    public int getEventBatchMaxSize() {
        return this.f37655e;
    }

    public int getEventBatchSize() {
        return this.f37654d;
    }

    public long getIntervalMs() {
        return this.f37653c;
    }

    public String getRequestUrl() {
        return this.f37651a;
    }
}
