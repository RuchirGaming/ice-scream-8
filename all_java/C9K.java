package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9K, reason: invalid class name */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C9K extends Exception {
    public final int A00;
    public final int A01;

    public C9K(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.A01 = i2;
        this.A00 = i3;
    }

    public static C9K A00(IOException iOException) {
        return new C9K(0, null, iOException, -1);
    }

    public static C9K A01(Exception exc, int i2) {
        return new C9K(1, null, exc, i2);
    }

    public static C9K A02(RuntimeException runtimeException) {
        return new C9K(2, null, runtimeException, -1);
    }
}
