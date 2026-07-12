package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21116a;

    private BidLossCode(int i2) {
        f21116a = i2;
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f21116a;
    }
}
