package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzce {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    public static int zza(String str, String str2) {
        zzcd zzcdVarZzc;
        switch (str) {
            case "audio/mpeg":
                return 9;
            case "audio/mp4a-latm":
                if (str2 == null || (zzcdVarZzc = zzc(str2)) == null) {
                    return 0;
                }
                return zzcdVarZzc.zza();
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/eac3-joc":
                return 18;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts":
                return 7;
            case "audio/vnd.dts.hd":
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/true-hd":
                return 14;
            case "audio/opus":
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzf(str)) {
            return 1;
        }
        if (zzg(str)) {
            return 2;
        }
        if ("text".equals(zzh(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if ("image".equals(zzh(str)) || "application/x-image-uri".equals(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzcc zzccVar = (zzcc) zzb.get(i2);
            String str2 = zzccVar.zza;
            if (str.equals(null)) {
                int i3 = zzccVar.zzb;
                return 0;
            }
        }
        return -1;
    }

    static zzcd zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new zzcd(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String zzd(int i2) {
        if (i2 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i2 == 33) {
            return "video/avc";
        }
        if (i2 == 35) {
            return "video/hevc";
        }
        if (i2 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i2 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i2 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i2 == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i2 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i2 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            default:
                switch (i2) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    public static boolean zze(String str, String str2) {
        zzcd zzcdVarZzc;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (zzcdVarZzc = zzc(str2)) == null || (iZza = zzcdVarZzc.zza()) == 0 || iZza == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzf(String str) {
        return "audio".equals(zzh(str));
    }

    public static boolean zzg(String str) {
        return "video".equals(zzh(str));
    }

    private static String zzh(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
