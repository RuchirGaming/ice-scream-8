package com.inmobi.media;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: compiled from: ErrorCode.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public enum w3 {
    NETWORK_UNAVAILABLE_ERROR(0),
    UNKNOWN_ERROR(-1),
    NETWORK_IO_ERROR(-2),
    OUT_OF_MEMORY_ERROR(-3),
    INVALID_ENCRYPTED_RESPONSE_RECEIVED(-4),
    RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT(-5),
    GZIP_DECOMPRESSION_FAILED(-6),
    BAD_REQUEST(-7),
    GDPR_COMPLIANCE_ENFORCED(-8),
    GENERIC_HTTP_2XX(-9),
    RESPONSE_PARSING_ERROR(-10),
    RETRY_ATTEMPTED(-11),
    NETWORK_UNAVAILABLE_CONTEXT_LOSS(-12),
    NETWORK_UNAVAILABLE_IDLE_MODE(-13),
    NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE(-14),
    NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M(-15),
    NETWORK_UNAVAILABLE_EXCEPTION(-16),
    NETWORK_PREPARE_FAIL(-17),
    HTTP_NO_CONTENT(204),
    HTTP_NOT_MODIFIED(304),
    HTTP_SEE_OTHER(303),
    HTTP_SERVER_NOT_FOUND(TTAdConstant.DEEPLINK_FALLBACK_CODE),
    HTTP_MOVED_TEMP(302),
    HTTP_INTERNAL_SERVER_ERROR(500),
    HTTP_NOT_IMPLEMENTED(501),
    HTTP_BAD_GATEWAY(502),
    HTTP_SERVER_NOT_AVAILABLE(503),
    HTTP_GATEWAY_TIMEOUT(504),
    HTTP_VERSION_NOT_SUPPORTED(505);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15200b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray<w3> f15201c = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15218a;

    /* JADX INFO: compiled from: ErrorCode.kt */
    public static final class a {
    }

    static {
        for (w3 w3Var : values()) {
            f15201c.put(w3Var.f15218a, w3Var);
        }
    }

    w3(int i2) {
        this.f15218a = i2;
    }
}
