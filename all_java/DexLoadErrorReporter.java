package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.google.common.net.HttpHeaders;
import com.ironsource.sdk.constants.b;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r5v3, types: [com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$1] */
    public static void reportDexLoadingIssue(final Context context, final String str, double d2) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (atomicBoolean.get() || Math.random() >= d2) {
            return;
        }
        atomicBoolean.set(true);
        new Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Code duplicated, block: B:70:0x0179 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:86:0x016e A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream;
                InputStream inputStream;
                HttpURLConnection httpURLConnection;
                super.run();
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(DexLoadErrorReporter.LOGGING_URL).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT, b.J);
                        httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, C.UTF8_NAME);
                        httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.connect();
                        String string = UUID.randomUUID().toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("attempt", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                        DexLoadErrorReporter.addEnvFields(context, jSONObject, string);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", "1");
                        jSONObject2.put("stacktrace", str);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("id", UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        httpURLConnection = httpURLConnection2;
                        try {
                            sb.append(System.currentTimeMillis() / 1000);
                            jSONObject3.put("session_time", sb.toString());
                            jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject3.put("session_id", string);
                            jSONObject3.put("data", jSONObject2);
                            jSONObject3.put("attempt", MBridgeConstans.ENDCARD_URL_TYPE_PL);
                            DexLoadErrorReporter.addEnvFields(context, jSONObject2, string);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("data", jSONObject);
                            jSONObject4.put("events", jSONArray);
                            String string2 = jSONObject4.toString();
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                            try {
                                dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, C.UTF8_NAME));
                                dataOutputStream2.flush();
                                byte[] bArr = new byte[16384];
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                while (true) {
                                    try {
                                        int i2 = inputStream2.read(bArr);
                                        if (i2 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr, 0, i2);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        inputStream = inputStream2;
                                        dataOutputStream = dataOutputStream2;
                                        try {
                                            Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                                        } finally {
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                } catch (Exception e2) {
                                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e2);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e3) {
                                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e3);
                                                }
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                        }
                                    }
                                }
                                byteArrayOutputStream.flush();
                                try {
                                    dataOutputStream2.close();
                                } catch (Exception e4) {
                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e4);
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e5) {
                                        Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e5);
                                    }
                                }
                                if (httpURLConnection == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream = dataOutputStream2;
                                inputStream = null;
                                Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = null;
                            inputStream = null;
                            Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = null;
                    inputStream = null;
                    httpURLConnection = null;
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }
}
