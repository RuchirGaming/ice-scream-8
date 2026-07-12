package com.yandex.div.histogram;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface HistogramBridge {
    void recordBooleanHistogram(String str, boolean z);

    void recordCountHistogram(String str, int i2, int i3, int i4, int i5);

    void recordEnumeratedHistogram(String str, int i2, int i3);

    void recordLinearCountHistogram(String str, int i2, int i3, int i4, int i5);

    void recordSparseSlowlyHistogram(String str, int i2);

    void recordTimeHistogram(String str, long j2, long j3, long j4, TimeUnit timeUnit, int i2);

    @Deprecated
    void recordTimeHistogram(String str, long j2, long j3, long j4, TimeUnit timeUnit, long j5);

    /* JADX INFO: renamed from: com.yandex.div.histogram.HistogramBridge$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
