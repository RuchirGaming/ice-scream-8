package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class ak extends Exception implements g {
    public static final g.a<ak> br = new g.a() { // from class: com.applovin.exoplayer2.ak$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return new ak(bundle);
        }
    };
    public final int errorCode;
    public final long gp;

    public static String V(int i2) {
        if (i2 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i2 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i2) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i2) {
                    case 2000:
                        return "ERROR_CODE_IO_UNSPECIFIED";
                    case 2001:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                    case 2002:
                        return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                    case 2003:
                        return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                    case 2004:
                        return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                    case 2005:
                        return "ERROR_CODE_IO_FILE_NOT_FOUND";
                    case 2006:
                        return "ERROR_CODE_IO_NO_PERMISSION";
                    case 2007:
                        return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                    case 2008:
                        return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                    default:
                        switch (i2) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i2) {
                                    case IronSourceConstants.NT_LOAD /* 4001 */:
                                        return "ERROR_CODE_DECODER_INIT_FAILED";
                                    case IronSourceConstants.NT_INSTANCE_LOAD /* 4002 */:
                                        return "ERROR_CODE_DECODER_QUERY_FAILED";
                                    case 4003:
                                        return "ERROR_CODE_DECODING_FAILED";
                                    case 4004:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS /* 4005 */:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i2) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case 6004:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case 6005:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case 6006:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case 6007:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case 6008:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i2 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public final String cA() {
        return V(this.errorCode);
    }

    protected ak(Bundle bundle) {
        this(bundle.getString(t(2)), j(bundle), bundle.getInt(t(0), 1000), bundle.getLong(t(1), SystemClock.elapsedRealtime()));
    }

    protected ak(String str, Throwable th, int i2, long j2) {
        super(str, th);
        this.errorCode = i2;
        this.gp = j2;
    }

    protected static String t(int i2) {
        return Integer.toString(i2, 36);
    }

    private static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static RemoteException q(String str) {
        return new RemoteException(str);
    }

    private static Throwable j(Bundle bundle) {
        String string = bundle.getString(t(3));
        String string2 = bundle.getString(t(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, ak.class.getClassLoader());
            Throwable thA = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (thA != null) {
                return thA;
            }
        } catch (Throwable unused) {
        }
        return q(string2);
    }
}
