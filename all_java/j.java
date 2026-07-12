package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: WindVaneUtil.java */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f21397a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f21398b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f21399c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f21400d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f21401e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Map<String, String> f21402f = new HashMap();

    static {
        for (e eVar : e.values()) {
            f21402f.put(eVar.a(), eVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f21397a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f21401e;
        }
        if ("mraid:".equals(str)) {
            return f21399c;
        }
        if ("ssp:".equals(str)) {
            return f21400d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f21401e;
        }
        return null;
    }

    public static String c(String str) {
        char[] cArr = {'\'', AbstractJsonLexerKt.STRING_ESC};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            boolean z = true;
            if (cCharAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase2);
            } else {
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        z = false;
                        break;
                    }
                    if (cArr[i3] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i3++;
                }
                if (!z) {
                    stringBuffer.append(cCharAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean d(String str) {
        return e(str).startsWith("image");
    }

    public static String e(String str) {
        String str2 = f21402f.get(f(str));
        return str2 == null ? "" : str2;
    }

    private static String f(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }
}
