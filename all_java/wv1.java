package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class wv1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f36556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f36557b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f36558c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36559d = 0;

    static float a(int i2) {
        return i2 / f36558c;
    }

    public static JSONObject a(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i2));
            jSONObject.put("y", a(i3));
            jSONObject.put("width", a(i4));
            jSONObject.put("height", a(i5));
        } catch (JSONException e2) {
            dw1.a("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f36558c = context.getResources().getDisplayMetrics().density;
            f36556a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    public static void a(JSONObject jSONObject) {
        float f2;
        float fMax = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                float fMax2 = 0.0f;
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                        double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                        double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                        double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                        fMax = Math.max(fMax, (float) (dOptDouble + dOptDouble3));
                        fMax2 = Math.max(fMax2, (float) (dOptDouble2 + dOptDouble4));
                    }
                }
                f2 = fMax;
                fMax = fMax2;
            } else {
                f2 = 0.0f;
            }
        } else if (f36556a != null) {
            Point point = new Point(0, 0);
            f36556a.getDefaultDisplay().getRealSize(point);
            float fA = a(point.x);
            fMax = a(point.y);
            f2 = fA;
        } else {
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", fMax);
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            dw1.a("JSONException during JSONObject.put for name [" + str + com.ironsource.sdk.constants.a.i.f17749e, e2);
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f36557b;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                z = true;
                break;
            }
            String str = strArr[i2];
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                z = false;
                break;
            }
            i2++;
        }
        if (z && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
            if (Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")) == Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus"))) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
                    z2 = true;
                } else {
                    if ((jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) || !(jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length())) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= jSONArrayOptJSONArray.length()) {
                                z2 = true;
                            } else if (jSONArrayOptJSONArray.optString(i3, "").equals(jSONArrayOptJSONArray2.optString(i3, ""))) {
                                i3++;
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                        z3 = true;
                    } else {
                        if ((jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) || !(jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray3.length() != jSONArrayOptJSONArray4.length())) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= jSONArrayOptJSONArray3.length()) {
                                    z3 = true;
                                } else if (a(jSONArrayOptJSONArray3.optJSONObject(i4), jSONArrayOptJSONArray4.optJSONObject(i4))) {
                                    i4++;
                                }
                            }
                        }
                        z3 = false;
                    }
                    if (z3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
