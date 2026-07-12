package com.pgl.ssdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class C1587c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FileFilter f23809a = new C1586b();

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    private static String a(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line = null;
        try {
            try {
                fileReader = new FileReader(str);
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        if (line == null) {
                            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
                        }
                        return line.trim();
                    }
                } catch (Throwable unused4) {
                    bufferedReader = null;
                }
            } catch (Throwable unused5) {
                bufferedReader = null;
                fileReader = null;
            }
            fileReader.close();
        } catch (Throwable unused6) {
        }
        if (line == null) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return line.trim();
    }

    private static HashMap a() {
        FileReader fileReader;
        HashMap map = new HashMap();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        } else {
                            String[] strArrSplit = line.split(":", 2);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        return map;
                    }
                }
                bufferedReader2.close();
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        return map;
    }

    public static String b() {
        int length;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap mapA = a();
            try {
                length = new File("/sys/devices/system/cpu/").listFiles(f23809a).length;
            } catch (Throwable unused) {
                length = -1;
            }
            jSONObject.put("core", length);
            String str2 = null;
            try {
                str = (String) mapA.get("Hardware");
            } catch (Throwable unused2) {
                str = null;
            }
            jSONObject.put("hw", str == null ? "" : str.trim());
            jSONObject.put("max", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            try {
                str2 = (String) mapA.get("Features");
            } catch (Throwable unused3) {
            }
            jSONObject.put("ft", str2 != null ? str2.trim() : "");
        } catch (Throwable unused4) {
        }
        String string = jSONObject.toString();
        return string == null ? JsonUtils.EMPTY_JSON : string.trim();
    }
}
