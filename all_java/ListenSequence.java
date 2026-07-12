package com.google.firebase.firestore.core;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class ListenSequence {
    public static final long INVALID = -1;
    private long previousSequenceNumber;

    public ListenSequence(long j2) {
        this.previousSequenceNumber = j2;
    }

    public long next() {
        long j2 = this.previousSequenceNumber + 1;
        this.previousSequenceNumber = j2;
        return j2;
    }
}
