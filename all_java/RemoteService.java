package cn.thinkinganalyticsclone.android.utils;

import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface RemoteService {
    String performRequest(String endpointUrl, String params, boolean debug, SSLSocketFactory sslSocketFactory, final Map<String, String> extraHeaders, String host, String ip) throws IOException, ServiceUnavailableException;

    public static class ServiceUnavailableException extends Exception {
        ServiceUnavailableException(String message) {
            super(message);
        }
    }
}
