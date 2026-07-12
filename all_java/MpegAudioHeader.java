package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 288, DtbConstants.DEFAULT_PLAYER_WIDTH, 352, 384, TypedValues.Cycle.TYPE_PATH_ROTATE, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, 256};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, DtbConstants.DEFAULT_PLAYER_WIDTH, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, DtbConstants.DEFAULT_PLAYER_WIDTH};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = SAMPLING_RATE_V1[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? BITRATE_V1_L1[i5 - 1] : BITRATE_V2_L1[i5 - 1]) * 12000) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? BITRATE_V1_L2[i5 - 1] : BITRATE_V1_L3[i5 - 1];
        } else {
            i7 = BITRATE_V2[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144000) / i8) + i9;
        }
        return (((i4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i7) / i8) + i9;
    }

    public static boolean populateHeader(int i2, MpegAudioHeader mpegAudioHeader) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = SAMPLING_RATE_V1[i6];
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i11 = i10;
        int i12 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? BITRATE_V1_L1[i5 - 1] : BITRATE_V2_L1[i5 - 1];
            i9 = (((i7 * 12000) / i11) + i12) * 4;
            i8 = 384;
        } else {
            int i13 = 1152;
            if (i3 == 3) {
                i7 = i4 == 2 ? BITRATE_V1_L2[i5 - 1] : BITRATE_V1_L3[i5 - 1];
            } else {
                i7 = BITRATE_V2[i5 - 1];
                i13 = i4 == 1 ? 576 : 1152;
                int i14 = i4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000;
                i8 = i13;
                i9 = ((i14 * i7) / i11) + i12;
            }
            i8 = i13;
            i9 = ((i14 * i7) / i11) + i12;
        }
        mpegAudioHeader.setValues(i3, MIME_TYPE_BY_LAYER[3 - i4], i9, i11, ((i2 >> 6) & 3) == 3 ? 1 : 2, i7 * 1000, i8);
        return true;
    }

    private void setValues(int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.version = i2;
        this.mimeType = str;
        this.frameSize = i3;
        this.sampleRate = i4;
        this.channels = i5;
        this.bitrate = i6;
        this.samplesPerFrame = i7;
    }
}
