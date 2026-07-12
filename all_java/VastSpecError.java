package com.explorestack.iab.vast;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class VastSpecError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8652a;
    public static final VastSpecError XML_PARSING = new VastSpecError(100);
    public static final VastSpecError XML_VALIDATE = new VastSpecError(101);
    public static final VastSpecError DURATION = new VastSpecError(202);
    public static final VastSpecError GENERAL_WRAPPER = new VastSpecError(LogSeverity.NOTICE_VALUE);
    public static final VastSpecError BAD_URI = new VastSpecError(301);
    public static final VastSpecError EXCEEDED_WRAPPER_LIMIT = new VastSpecError(302);
    public static final VastSpecError WRAPPER_RESPONSE_NO_AD = new VastSpecError(303);
    public static final VastSpecError GENERAL_LINEAR = new VastSpecError(400);
    public static final VastSpecError NO_FILE = new VastSpecError(TTAdConstant.MATE_IS_NULL_CODE);
    public static final VastSpecError BAD_FILE = new VastSpecError(403);
    public static final VastSpecError SHOWING = new VastSpecError(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
    public static final VastSpecError GENERAL_COMPANION = new VastSpecError(600);
    public static final VastSpecError UNKNOWN = new VastSpecError(900);

    private VastSpecError(int i2) {
        this.f8652a = i2;
    }

    public int getCode() {
        return this.f8652a;
    }

    public String toString() {
        return String.format("%s", Integer.valueOf(this.f8652a));
    }
}
