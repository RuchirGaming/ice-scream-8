package com.yodo1.mas.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class JSONUtils {
    public static String optionalStringKey(JSONObject o2, String k2) throws JSONException {
        if (!o2.has(k2) || o2.isNull(k2)) {
            return null;
        }
        return o2.getString(k2);
    }

    private static void addIndentBlank(StringBuilder sb, int indent) {
        for (int i2 = 0; i2 < indent; i2++) {
            try {
                sb.append('\t');
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0041 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:22:0x003b, B:36:0x0070, B:24:0x0041, B:25:0x0049, B:26:0x004d, B:28:0x0052, B:29:0x005b, B:32:0x0062, B:34:0x006b, B:35:0x006d, B:37:0x0074), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:22:0x003b, B:36:0x0070, B:24:0x0041, B:25:0x0049, B:26:0x004d, B:28:0x0052, B:29:0x005b, B:32:0x0062, B:34:0x006b, B:35:0x006d, B:37:0x0074), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:22:0x003b, B:36:0x0070, B:24:0x0041, B:25:0x0049, B:26:0x004d, B:28:0x0052, B:29:0x005b, B:32:0x0062, B:34:0x006b, B:35:0x006d, B:37:0x0074), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0070 A[SYNTHETIC] */
    public static String formatJson(String jsonStr) {
        if (jsonStr != null) {
            try {
                if (!"".equals(jsonStr)) {
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    char c2 = 0;
                    boolean z = false;
                    int i3 = 0;
                    while (i2 < jsonStr.length()) {
                        char cCharAt = jsonStr.charAt(i2);
                        if (cCharAt == '\"') {
                            if (c2 != '\\') {
                                z = !z;
                            }
                            sb.append(cCharAt);
                        } else if (cCharAt == ',') {
                            sb.append(cCharAt);
                            if (c2 != '\\' && !z) {
                                sb.append('\n');
                                addIndentBlank(sb, i3);
                            }
                        } else if (cCharAt == '[') {
                            sb.append(cCharAt);
                            if (!z) {
                                sb.append('\n');
                                i3++;
                                addIndentBlank(sb, i3);
                            }
                        } else if (cCharAt == ']') {
                            if (!z) {
                                sb.append('\n');
                                i3--;
                                addIndentBlank(sb, i3);
                            }
                            sb.append(cCharAt);
                        } else if (cCharAt == '{') {
                            sb.append(cCharAt);
                            if (!z) {
                                sb.append('\n');
                                i3++;
                                addIndentBlank(sb, i3);
                            }
                        } else if (cCharAt == '}') {
                            if (!z) {
                                sb.append('\n');
                                i3--;
                                addIndentBlank(sb, i3);
                            }
                            sb.append(cCharAt);
                        } else {
                            sb.append(cCharAt);
                        }
                        i2++;
                        c2 = cCharAt;
                    }
                    return sb.toString();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return "";
    }
}
