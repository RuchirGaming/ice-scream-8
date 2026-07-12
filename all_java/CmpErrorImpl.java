package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class CmpErrorImpl implements AppLovinCmpError {
    private final AppLovinCmpError.Code axs;
    private final String axt;
    private final int axu;
    private final String axv;

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.axs;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.axt;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.axu;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.axv;
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i2, String str2) {
        this.axs = code;
        this.axt = str;
        this.axu = i2;
        this.axv = str2;
    }
}
