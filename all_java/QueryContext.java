package com.google.firebase.firestore.local;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class QueryContext {
    private int documentReadCount = 0;

    public int getDocumentReadCount() {
        return this.documentReadCount;
    }

    public void incrementDocumentReadCount() {
        this.documentReadCount++;
    }
}
