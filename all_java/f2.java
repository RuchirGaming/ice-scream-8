package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mn1 f30610a;

    public f2(mn1 mn1Var) {
        this.f30610a = mn1Var;
    }

    public final long a(in inVar) {
        long jB = inVar.b();
        int iOrdinal = inVar.a().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return jB;
            }
        } else {
            if (jB == 100) {
                return Long.MIN_VALUE;
            }
            if (jB == 0) {
                return 0L;
            }
            long jA = this.f30610a.a();
            if (jA != C.TIME_UNSET) {
                return (long) ((jB / 100.0f) * jA);
            }
        }
        return -1L;
    }
}
