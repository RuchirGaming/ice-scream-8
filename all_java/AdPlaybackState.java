package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public static final AdPlaybackState NONE = new AdPlaybackState(new long[0]);
    public final int adGroupCount;
    public final long[] adGroupTimesUs;
    public final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final long contentDurationUs;

    public @interface AdState {
    }

    public static final class AdGroup {
        public final int count;
        public final long[] durationsUs;
        public final int[] states;
        public final Uri[] uris;

        public AdGroup() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private AdGroup(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.count = i2;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
        }

        public final int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public final int getNextAdIndexToPlay(int i2) {
            int i3 = i2 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || iArr[i3] == 0 || iArr[i3] == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean hasUnplayedAds() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public final AdGroup withAdCount(int i2) {
            Assertions.checkArgument(this.count == -1 && this.states.length <= i2);
            return new AdGroup(i2, copyStatesWithSpaceForAdCount(this.states, i2), (Uri[]) Arrays.copyOf(this.uris, i2), copyDurationsUsWithSpaceForAdCount(this.durationsUs, i2));
        }

        public final AdGroup withAdUri(Uri uri, int i2) {
            int i3 = this.count;
            Assertions.checkArgument(i3 == -1 || i2 < i3);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            Assertions.checkArgument(iArrCopyStatesWithSpaceForAdCount[i2] == 0);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, iArrCopyStatesWithSpaceForAdCount.length);
            uriArr[i2] = uri;
            iArrCopyStatesWithSpaceForAdCount[i2] = 1;
            return new AdGroup(this.count, iArrCopyStatesWithSpaceForAdCount, uriArr, jArrCopyDurationsUsWithSpaceForAdCount);
        }

        public final AdGroup withAdState(int i2, int i3) {
            int i4 = this.count;
            Assertions.checkArgument(i4 == -1 || i3 < i4);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i3 + 1);
            Assertions.checkArgument(iArrCopyStatesWithSpaceForAdCount[i3] == 0 || iArrCopyStatesWithSpaceForAdCount[i3] == 1 || iArrCopyStatesWithSpaceForAdCount[i3] == i2);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr = this.uris;
            if (uriArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            iArrCopyStatesWithSpaceForAdCount[i3] = i2;
            return new AdGroup(this.count, iArrCopyStatesWithSpaceForAdCount, uriArr, jArrCopyDurationsUsWithSpaceForAdCount);
        }

        public final AdGroup withAdDurationsUs(long[] jArr) {
            Assertions.checkArgument(this.count == -1 || jArr.length <= this.uris.length);
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            }
            return new AdGroup(this.count, this.states, this.uris, jArr);
        }

        public final AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                if (iArrCopyOf[i2] == 1 || iArrCopyOf[i2] == 0) {
                    iArrCopyOf[i2] = 2;
                }
            }
            return new AdGroup(length, iArrCopyOf, this.uris, this.durationsUs);
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }
    }

    public AdPlaybackState(long... jArr) {
        int length = jArr.length;
        this.adGroupCount = length;
        this.adGroupTimesUs = Arrays.copyOf(jArr, length);
        this.adGroups = new AdGroup[length];
        for (int i2 = 0; i2 < length; i2++) {
            this.adGroups[i2] = new AdGroup();
        }
        this.adResumePositionUs = 0L;
        this.contentDurationUs = C.TIME_UNSET;
    }

    private AdPlaybackState(long[] jArr, AdGroup[] adGroupArr, long j2, long j3) {
        this.adGroupCount = adGroupArr.length;
        this.adGroupTimesUs = jArr;
        this.adGroups = adGroupArr;
        this.adResumePositionUs = j2;
        this.contentDurationUs = j3;
    }

    public final int getAdGroupIndexForPositionUs(long j2) {
        int length = this.adGroupTimesUs.length - 1;
        while (length >= 0) {
            long[] jArr = this.adGroupTimesUs;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j2) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.adGroups[length].hasUnplayedAds()) {
            return -1;
        }
        return length;
    }

    public final int getAdGroupIndexAfterPositionUs(long j2) {
        int i2 = 0;
        while (true) {
            long[] jArr = this.adGroupTimesUs;
            if (i2 >= jArr.length || jArr[i2] == Long.MIN_VALUE || (j2 < jArr[i2] && this.adGroups[i2].hasUnplayedAds())) {
                break;
            }
            i2++;
        }
        if (i2 < this.adGroupTimesUs.length) {
            return i2;
        }
        return -1;
    }

    public final AdPlaybackState withAdCount(int i2, int i3) {
        Assertions.checkArgument(i3 > 0);
        if (this.adGroups[i2].count == i3) {
            return this;
        }
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.adGroups[i2].withAdCount(i3);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdUri(int i2, int i3, Uri uri) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdUri(uri, i3);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withPlayedAd(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdState(3, i3);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAd(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdState(2, i3);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdLoadError(int i2, int i3) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdState(4, i3);
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withSkippedAdGroup(int i2) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdDurationsUs(long[][] jArr) {
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Arrays.copyOf(adGroupArr, adGroupArr.length);
        for (int i2 = 0; i2 < this.adGroupCount; i2++) {
            adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr[i2]);
        }
        return new AdPlaybackState(this.adGroupTimesUs, adGroupArr2, this.adResumePositionUs, this.contentDurationUs);
    }

    public final AdPlaybackState withAdResumePositionUs(long j2) {
        return this.adResumePositionUs == j2 ? this : new AdPlaybackState(this.adGroupTimesUs, this.adGroups, j2, this.contentDurationUs);
    }

    public final AdPlaybackState withContentDurationUs(long j2) {
        return this.contentDurationUs == j2 ? this : new AdPlaybackState(this.adGroupTimesUs, this.adGroups, this.adResumePositionUs, j2);
    }
}
