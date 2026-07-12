package com.amazon.device.ads;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public enum DTBLogLevel {
    All(0),
    Trace(1),
    Debug(2),
    Info(3),
    Warn(4),
    Error(5),
    Fatal(6),
    Off(7);

    private int value;

    DTBLogLevel(int i2) {
        this.value = i2;
    }

    public int intValue() {
        return this.value;
    }
}
