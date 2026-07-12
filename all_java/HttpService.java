package cn.thinkinganalyticsclone.android.utils;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.internal.AssetHelper;
import com.ironsource.sdk.constants.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class HttpService implements RemoteService {
    private static final String TAG = "ThinkingAnalyticsClone.HttpService";

    /* JADX WARN: Code duplicated, block: B:100:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // cn.thinkinganalyticsclone.android.utils.RemoteService
    public String performRequest(String str, String str2, boolean z, SSLSocketFactory sSLSocketFactory, Map<String, String> map, final String str3, String str4) throws Throwable {
        String strReplace;
        InputStream inputStream;
        BufferedReader bufferedReader;
        ?? r7;
        HttpURLConnection httpURLConnection;
        String strEncodeData;
        BufferedOutputStream bufferedOutputStream = null;
        if (str4 != null) {
            try {
                strReplace = str.replace(str3, str4);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
                bufferedReader = null;
                r7 = 0;
                httpURLConnection = null;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                if (r7 != 0) {
                    try {
                        r7.close();
                    } catch (IOException unused2) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
        } else {
            strReplace = str;
        }
        httpURLConnection = (HttpURLConnection) new URL(strReplace).openConnection();
        if (sSLSocketFactory != null) {
            try {
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
                bufferedReader = null;
                r7 = bufferedReader;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (r7 != 0) {
                    r7.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
        }
        if ((httpURLConnection instanceof HttpsURLConnection) && str4 != null) {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: cn.thinkinganalyticsclone.android.utils.HttpService.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String hostname, SSLSession session) {
                    return HttpsURLConnection.getDefaultHostnameVerifier().verify(str3, session);
                }
            });
        }
        if (str2 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(12000);
            httpURLConnection.setRequestMethod("POST");
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty(b.K, b.L);
                strEncodeData = str2;
            } else {
                httpURLConnection.setRequestProperty("Content-Type", AssetHelper.DEFAULT_MIME_TYPE);
                try {
                    strEncodeData = encodeData(str2);
                } catch (IOException e2) {
                    throw new InvalidParameterException(e2.getMessage());
                }
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.setFixedLengthStreamingMode(strEncodeData.getBytes(C.UTF8_NAME).length);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream2.write(strEncodeData.getBytes(C.UTF8_NAME));
                    bufferedOutputStream2.flush();
                    bufferedOutputStream2.close();
                    outputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    TDLog.d(TAG, "ret_code:" + responseCode);
                    if (responseCode != 200) {
                        if (str4 != null) {
                            String strPerformRequest = performRequest(strReplace.replace(str4, str3), str2, z, sSLSocketFactory, map, null, null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return strPerformRequest;
                        }
                        throw new RemoteService.ServiceUnavailableException("Service unavailable with response code: " + responseCode);
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            }
                            inputStream.close();
                            bufferedReader.close();
                            String string = sb.toString();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            try {
                                bufferedReader.close();
                            } catch (IOException unused6) {
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return string;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = 0;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = null;
                        r7 = bufferedReader;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (r7 != 0) {
                            r7.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                    bufferedReader = null;
                    bufferedOutputStream = bufferedOutputStream2;
                    r7 = outputStream;
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
                bufferedReader = null;
                r7 = outputStream;
            }
        } else {
            throw new InvalidParameterException("Content is null");
        }
    }

    private String encodeData(final String rawMessage) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(rawMessage.getBytes().length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(rawMessage.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new String(Base64Coder.encode(byteArray));
    }
}
