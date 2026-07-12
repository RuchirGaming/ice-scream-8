package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.1
        @Override // java.util.Comparator
        public final int compare(Sample sample, Sample sample2) {
            return sample.index - sample2.index;
        }
    };
    private static final Comparator<Sample> VALUE_COMPARATOR = new Comparator<Sample>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.SlidingPercentile.2
        @Override // java.util.Comparator
        public final int compare(Sample sample, Sample sample2) {
            if (sample.value < sample2.value) {
                return -1;
            }
            return sample2.value < sample.value ? 1 : 0;
        }
    };
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    public SlidingPercentile(int i2) {
        this.maxWeight = i2;
    }

    public void addSample(int i2, float f2) {
        Sample sample;
        ensureSortedByIndex();
        int i3 = this.recycledSampleCount;
        if (i3 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i4 = i3 - 1;
            this.recycledSampleCount = i4;
            sample = sampleArr[i4];
        } else {
            sample = new Sample();
        }
        int i5 = this.nextSampleIndex;
        this.nextSampleIndex = i5 + 1;
        sample.index = i5;
        sample.weight = i2;
        sample.value = f2;
        this.samples.add(sample);
        this.totalWeight += i2;
        while (true) {
            int i6 = this.totalWeight;
            int i7 = this.maxWeight;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            Sample sample2 = this.samples.get(0);
            if (sample2.weight <= i8) {
                this.totalWeight -= sample2.weight;
                this.samples.remove(0);
                int i9 = this.recycledSampleCount;
                if (i9 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i9 + 1;
                    sampleArr2[i9] = sample2;
                }
            } else {
                sample2.weight -= i8;
                this.totalWeight -= i8;
            }
        }
    }

    public float getPercentile(float f2) {
        ensureSortedByValue();
        float f3 = f2 * this.totalWeight;
        int i2 = 0;
        for (int i3 = 0; i3 < this.samples.size(); i3++) {
            Sample sample = this.samples.get(i3);
            i2 += sample.weight;
            if (i2 >= f3) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<Sample> arrayList = this.samples;
        return arrayList.get(arrayList.size() - 1).value;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    private static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }
}
