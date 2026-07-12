package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzcib {
    private static final Pattern zza = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern zzb = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String zza(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = zza.matcher(str);
        int i2 = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            while (i2 <= 0) {
                String str2 = strArr[i2];
                if (str2 != null) {
                    sb.append(str2);
                }
                i2++;
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!zzb.matcher(str).find()) {
                while (i2 <= 0) {
                    String str3 = strArr[i2];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i2++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
