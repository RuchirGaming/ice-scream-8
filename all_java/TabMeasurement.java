package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class TabMeasurement {
    private static final String FIRST_TAB_HEIGHT_PREFIX = "FIRST_TAB_HEIGHT_PREFIX";
    private static final String MAX_TAB_HEIGHT_PREFIX = "MAX_TAB_HEIGHT_PREFIX";
    private int mFirstTabHeight = -1;
    private int mMaxTabHeight = -1;
    private final int mTabCount;
    private int[] mTabHeight;
    private final TabMeasurementFunction mTabMeasurementFunction;

    interface TabMeasurementFunction {
        int getTabHeight(int i2);
    }

    TabMeasurement(int i2, TabMeasurementFunction tabMeasurementFunction) {
        this.mTabCount = i2;
        this.mTabMeasurementFunction = tabMeasurementFunction;
        this.mTabHeight = new int[i2];
    }

    int getFirstTabHeight() {
        if (this.mFirstTabHeight < 0) {
            this.mFirstTabHeight = this.mTabMeasurementFunction.getTabHeight(0);
        }
        return this.mFirstTabHeight;
    }

    int getTabHeight(int i2) {
        int i3 = this.mTabCount;
        if (i3 == 0) {
            return 0;
        }
        if (i2 < 0) {
            return getTabHeight(0);
        }
        if (i2 >= i3) {
            return getTabHeight(i3);
        }
        int[] iArr = this.mTabHeight;
        if (iArr[i2] <= 0) {
            iArr[i2] = this.mTabMeasurementFunction.getTabHeight(i2);
        }
        return this.mTabHeight[i2];
    }

    int getMaxTabHeight() {
        if (this.mMaxTabHeight < 0) {
            int firstTabHeight = getFirstTabHeight();
            for (int i2 = 1; i2 < this.mTabCount; i2++) {
                firstTabHeight = Math.max(firstTabHeight, this.mTabMeasurementFunction.getTabHeight(i2));
            }
            this.mMaxTabHeight = firstTabHeight;
        }
        return this.mMaxTabHeight;
    }

    void saveState(Bundle bundle, int i2) {
        if (this.mFirstTabHeight >= 0) {
            bundle.putInt(FIRST_TAB_HEIGHT_PREFIX + i2, this.mFirstTabHeight);
        }
        if (this.mMaxTabHeight >= 0) {
            bundle.putInt(MAX_TAB_HEIGHT_PREFIX + i2, this.mMaxTabHeight);
        }
    }

    void restoreState(Bundle bundle, int i2) {
        this.mFirstTabHeight = bundle.getInt(FIRST_TAB_HEIGHT_PREFIX + i2, -1);
        this.mMaxTabHeight = bundle.getInt(MAX_TAB_HEIGHT_PREFIX + i2, -1);
    }

    void removeState(Bundle bundle, int i2) {
        bundle.remove(FIRST_TAB_HEIGHT_PREFIX + i2);
        bundle.remove(MAX_TAB_HEIGHT_PREFIX + i2);
    }
}
