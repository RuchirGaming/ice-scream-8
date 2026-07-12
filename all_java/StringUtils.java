package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class StringUtils {
    private static final char[] aWe = "0123456789abcdef".toCharArray();

    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i2) {
        return isNumeric(str) ? Integer.parseInt(str) : i2;
    }

    public static long parseLong(String str, long j2) {
        return isNumeric(str) ? Long.parseLong(str) : j2;
    }

    public static boolean containsIgnoreCase(String str, String str2) {
        return isValidString(str) && isValidString(str2) && str.toLowerCase().contains(str2.toLowerCase());
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static String replace(String str, String str2, String str3) {
        if (str3 == null) {
            throw new IllegalArgumentException("No replacement target specified");
        }
        if (str == null || str.length() < 1 || str2 == null || str2.length() < 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int iIndexOf = sb.indexOf(str2);
        while (iIndexOf != -1) {
            sb.replace(iIndexOf, str2.length() + iIndexOf, str3);
            iIndexOf = sb.indexOf(str2, iIndexOf + str3.length());
        }
        return sb.toString();
    }

    public static String replace(String str, Map<String, String> map) {
        if (str != null && map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i2 = (cCharAt == '-' || cCharAt == '+') ? 1 : 0;
        int length = str.length();
        if (i2 == 1 && length == 1) {
            return false;
        }
        while (i2 < length) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static boolean isAlphaNumeric(String str) {
        if (isValidString(str)) {
            return str.matches("^[a-zA-Z0-9]*$");
        }
        return false;
    }

    public static String prefixToIndex(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        return str.substring(0, i2);
    }

    public static String encodeUriString(String str) {
        return isValidString(str) ? Uri.encode(str) : "";
    }

    public static String appendQueryParameter(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static String appendQueryParameters(String str, Map<String, String> map, boolean z) {
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (z) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.StringUtils.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public int compare(String str2, String str3) {
                    return str2.compareToIgnoreCase(str3);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static String getHost(String str) {
        return Uri.parse(str).getHost();
    }

    public static String getHostAndPath(String str) {
        Uri uri = Uri.parse(str);
        return uri.getHost() + uri.getPath();
    }

    public static String toFullSHA1Hash(String str) {
        return b(str, -1);
    }

    public static String toShortSHA1Hash(String str) {
        return b(str, 16);
    }

    private static String b(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(str.getBytes(C.UTF8_NAME));
            String hexString = toHexString(messageDigest.digest());
            return num.intValue() > 0 ? hexString.substring(0, Math.min(num.intValue(), hexString.length())) : hexString;
        } catch (Throwable th) {
            throw new RuntimeException("SHA-1 for \"" + str + "\" failed.", th);
        }
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("No data specified");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            char[] cArr2 = aWe;
            cArr[i3] = cArr2[(bArr[i2] & 240) >>> 4];
            cArr[i3 + 1] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    public static String toHumanReadableString(String str) {
        if (!isValidString(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : str.split("_")) {
            if (isValidString(str2)) {
                if (str2.equals("id")) {
                    sb.append(str2.toUpperCase(Locale.ENGLISH));
                } else {
                    sb.append(str2.substring(0, 1).toUpperCase(Locale.ENGLISH));
                    sb.append(str2.substring(1).toLowerCase(Locale.ENGLISH));
                }
                sb.append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static Boolean endsWith(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAtLeastOneSubstring(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean startsWithAtLeastOnePrefix(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static SpannedString createListItemDetailSpannedString(String str, int i2) {
        return createSpannedString(str, i2, 16);
    }

    public static SpannedString createListItemDetailSubSpannedString(String str, int i2) {
        return createSpannedString(str, i2, 12, 1);
    }

    public static SpannedString createSpannedString(String str, int i2, int i3) {
        return createSpannedString(str, i2, i3, 0);
    }

    public static SpannedString createSpannedString(String str, int i2, int i3, int i4) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i2), 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i3, true), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(i4), 0, spannableString.length(), 33);
        return new SpannedString(spannableString);
    }

    public static void addLinks(Spannable spannable, Pattern pattern, ClickableSpan clickableSpan, boolean z) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            spannable.setSpan(clickableSpan, iStart, iEnd, 33);
            if (z) {
                spannable.setSpan(new StyleSpan(1), iStart, iEnd, 256);
            }
        }
    }

    public static String toDigitsOnlyVersionString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\.");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (isValidString(str2)) {
                String[] strArrSplit2 = str2.split("[^0-9]+");
                if (strArrSplit2.length > 0) {
                    arrayList.add(strArrSplit2[0]);
                }
            }
        }
        return TextUtils.join(".", arrayList);
    }

    public static String join(CharSequence charSequence, List<?> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(charSequence);
        }
        sb.delete((sb.length() - 1) - charSequence.length(), sb.length());
        return sb.toString();
    }

    public static Matcher match(String str, String str2) {
        return Pattern.compile(str2).matcher(str);
    }

    public static List<String> getRegexMatches(Matcher matcher, int i2) {
        matcher.reset();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group(i2);
            if (isValidString(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }
}
