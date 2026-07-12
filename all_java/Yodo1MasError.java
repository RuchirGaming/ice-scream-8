package com.yodo1.mas.error;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasError {
    public static final int CODE_ACTIVITY_UNAVAILABLE = -400003;
    public static final int CODE_ADVERT_BANNER_SIZE_NOT_SUPPORT = -600203;
    public static final int CODE_ADVERT_CAPPING_PACING_NOT_MET = -600205;
    public static final int CODE_ADVERT_CONFIG_NULL = -600000;
    public static final int CODE_ADVERT_LOAD_FAIL = -600202;
    public static final int CODE_ADVERT_MULTIPLE_BANNER_NOT_SUPPORT = -600204;
    public static final int CODE_ADVERT_NO_LOADED = -600200;
    public static final int CODE_ADVERT_SHOW_FAIL = -600201;
    public static final int CODE_ADVERT_UNINITIALIZED = -600001;
    public static final int CODE_APP_ID_ILLEGAL = -400000;
    public static final int CODE_APP_ID_UNVERIFIED = -400001;
    public static final int CODE_CONFIG_GET = -100501;
    public static final int CODE_CONFIG_NETWORK = -100000;
    public static final int CODE_NECESSARY_ID_UNVERIFIED = -400002;
    public static final int CODE_UNKNOWN = -1;
    private final int code;
    private final String message;

    public Yodo1MasError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        String str = this.message;
        return str != null ? str : "unknown error";
    }

    public JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", getCode());
            jSONObject.put("message", getMessage());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return "Yodo1MasError{code=" + this.code + ", message='" + this.message + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
