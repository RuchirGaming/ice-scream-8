package com.yodo1.mas.error;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Yodo1MasNetworkError {
    private String displayErrorCode;
    private String displayErrorMessage;

    public Yodo1MasNetworkError(String displayErrorCode, String displayErrorMessage) {
        this.displayErrorCode = displayErrorCode;
        this.displayErrorMessage = displayErrorMessage;
    }

    public String getDisplayErrorCode() {
        return this.displayErrorCode;
    }

    public void setDisplayErrorCode(String displayErrorCode) {
        this.displayErrorCode = displayErrorCode;
    }

    public String getDisplayErrorMessage() {
        return this.displayErrorMessage;
    }

    public void setDisplayErrorMessage(String displayErrorMessage) {
        this.displayErrorMessage = displayErrorMessage;
    }
}
