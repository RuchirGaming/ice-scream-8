package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class fj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f30778a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f30779b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30780c = 0;

    private static final class a {
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30781a;

        public b(int i2) {
            this.f30781a = i2;
        }
    }

    public static String a(int i2) {
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

    public static boolean a(String str, String str2) {
        b bVar;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c2 = '\n';
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                if (str2 == null) {
                    return false;
                }
                Matcher matcher = f30779b.matcher(str2);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    String strGroup2 = matcher.group(2);
                    try {
                        Integer.parseInt(strGroup, 16);
                        bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                    } catch (NumberFormatException unused) {
                        bVar = null;
                    }
                    break;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return false;
                }
                int i2 = bVar.f30781a;
                if (i2 != 2) {
                    if (i2 == 5) {
                        c2 = 11;
                    } else if (i2 == 29) {
                        c2 = '\f';
                    } else if (i2 == 42) {
                        c2 = 16;
                    } else if (i2 != 22) {
                        c2 = i2 != 23 ? (char) 0 : (char) 15;
                    } else {
                        c2 = 0;
                    }
                }
                return (c2 == 0 || c2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b bVar;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null) {
                    return 0;
                }
                Matcher matcher = f30779b.matcher(str2);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    String strGroup2 = matcher.group(2);
                    try {
                        Integer.parseInt(strGroup, 16);
                        bVar = new b(strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
                    } catch (NumberFormatException unused) {
                        bVar = null;
                    }
                    break;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    return 0;
                }
                int i2 = bVar.f30781a;
                if (i2 == 2) {
                    return 10;
                }
                if (i2 == 5) {
                    return 11;
                }
                if (i2 == 29) {
                    return 12;
                }
                if (i2 == 42) {
                    return 16;
                }
                if (i2 != 22) {
                    return i2 != 23 ? 0 : 15;
                }
                return 1073741824;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static boolean c(String str) {
        int iIndexOf;
        return "text".equals((str != null && (iIndexOf = str.indexOf(47)) != -1) ? str.substring(0, iIndexOf) : null) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean d(String str) {
        int iIndexOf;
        return "video".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }

    public static boolean b(String str) {
        int iIndexOf;
        return "audio".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf));
    }

    public static int a(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (b(str)) {
            return 1;
        }
        if (d(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("image".equals((str == null || (iIndexOf = str.indexOf(47)) == -1) ? null : str.substring(0, iIndexOf))) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = f30778a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f30778a.get(i2).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }
}
