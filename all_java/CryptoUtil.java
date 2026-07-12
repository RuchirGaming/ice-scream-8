package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class CryptoUtil {
    private CryptoUtil() {
    }

    public static long getFNV64Hash(String str) {
        long j2 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            long jCharAt = j2 ^ ((long) str.charAt(i2));
            j2 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j2;
    }
}
