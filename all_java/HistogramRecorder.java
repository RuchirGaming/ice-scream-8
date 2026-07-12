package com.yandex.div.histogram;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class HistogramRecorder {
    private final HistogramBridge mBridge;

    public HistogramRecorder(HistogramBridge histogramBridge) {
        this.mBridge = histogramBridge;
    }

    public void recordBooleanHistogram(String str, boolean z) {
        this.mBridge.recordBooleanHistogram(str, z);
    }

    public void recordEnumeratedHistogram(String str, int i2, int i3) {
        this.mBridge.recordEnumeratedHistogram(str, i2, i3);
    }

    public void recordPercentageHistogram(String str, int i2) {
        this.mBridge.recordLinearCountHistogram(str, i2, 1, 101, 102);
    }

    public void recordLinearCountHistogram(String str, int i2, int i3, int i4, int i5) {
        this.mBridge.recordLinearCountHistogram(str, i2, i3, i4, i5);
    }

    public void recordCount100Histogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 100, 50);
    }

    public void recordCount1KHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 1000, 50);
    }

    public void recordCount10KHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 10000, 50);
    }

    public void recordCount100KHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, DefaultOggSeeker.MATCH_BYTE_RANGE, 50);
    }

    public void recordCount1MHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 1000000, 50);
    }

    public void recordCustomCountHistogram(String str, int i2, int i3, int i4, int i5) {
        this.mBridge.recordCountHistogram(str, i2, i3, i4, i5);
    }

    public void recordShortTimeHistogram(String str, long j2, TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j2), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordMediumTimeHistogram(String str, long j2, TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j2), 1L, 180000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordLongTimeHistogram(String str, long j2, TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j2), 1L, 3600000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordCustomTimeHistogram(String str, long j2, long j3, long j4, TimeUnit timeUnit, int i2) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j2), timeUnit.toMillis(j3), timeUnit.toMillis(j4), TimeUnit.MILLISECONDS, i2);
    }

    public void recordMemoryKbHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1000, 500000, 50);
    }

    public void recordMemoryMbHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 1000, 50);
    }

    public void recordLargeMemoryMbHistogram(String str, int i2) {
        this.mBridge.recordCountHistogram(str, i2, 1, 64000, 100);
    }

    public void recordSparseSlowlyHistogram(String str, int i2) {
        this.mBridge.recordSparseSlowlyHistogram(str, i2);
    }
}
