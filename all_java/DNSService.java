package cn.thinkinganalyticsclone.android.utils;

import com.ironsource.sdk.constants.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class DNSService {
    private static final String TAG = "ThinkingAnalyticsClone.DNSService";
    private static int requestCount;

    private static void request(final URL url, final String host, final RequestListener listener) {
        new Thread(new Runnable() { // from class: cn.thinkinganalyticsclone.android.utils.DNSService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                DNSService.lambda$request$0(url, listener, host);
            }
        }).start();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[Catch: IOException -> 0x00bc, TRY_LEAVE, TryCatch #7 {IOException -> 0x00bc, blocks: (B:42:0x00b8, B:46:0x00c0), top: B:54:0x00b8 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.net.HttpURLConnection] */
    static /* synthetic */ void lambda$request$0(URL url, RequestListener requestListener, String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    url = (HttpURLConnection) url.openConnection();
                    try {
                        url.setRequestMethod("GET");
                        url.setConnectTimeout(3000);
                        url.setReadTimeout(3000);
                        url.setRequestProperty("Content-Type", b.J);
                        url.setRequestProperty("Content-Type", "charset=utf-8");
                        url.setRequestProperty("accept", "application/dns-json");
                        if (200 == url.getResponseCode()) {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.getInputStream(), C.UTF8_NAME));
                            while (true) {
                                try {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb.append(line);
                                    }
                                } catch (Exception unused) {
                                    bufferedReader = bufferedReader2;
                                    requestDNS(str, requestListener);
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (url != 0) {
                                        url.disconnect();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                            if (url != 0) {
                                                url.disconnect();
                                            }
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                            throw th;
                                        }
                                    } else if (url != 0) {
                                        url.disconnect();
                                    }
                                    throw th;
                                }
                            }
                            JSONObject jSONObject = new JSONObject(sb.toString());
                            int iOptInt = jSONObject.optInt("Status");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("Answer");
                            if (iOptInt == 0 && jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                requestListener.requestEnd(iOptInt, jSONArrayOptJSONArray.optJSONObject(jSONArrayOptJSONArray.length() - 1).optString("data"));
                                requestCount = 0;
                            } else {
                                requestDNS(str, requestListener);
                            }
                            bufferedReader = bufferedReader2;
                        } else {
                            requestDNS(str, requestListener);
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (url != 0) {
                            url.disconnect();
                        }
                    } catch (Exception unused2) {
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Exception unused3) {
                url = 0;
            } catch (Throwable th2) {
                th = th2;
                url = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void requestDNS(String host, RequestListener listener) {
        if (listener == null) {
            TDLog.e(TAG, "RequestListener is null !");
            return;
        }
        int i2 = requestCount;
        int i3 = (i2 < 0 || i2 >= 3) ? 0 : i2;
        if (i2 >= 3) {
            TDLog.e(TAG, "DNS 请求超过3次 ");
            requestCount = 0;
            return;
        }
        try {
            request(new URL(TDConstants.DNS_SERVERS[i3] + host), host, listener);
            requestCount++;
        } catch (MalformedURLException e2) {
            TDLog.e(TAG, "Invalid URL: " + e2);
        }
    }
}
