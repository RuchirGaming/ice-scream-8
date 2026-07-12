package com.facebook.ads.redexgen.X;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1329Uc implements InterfaceC1039Is {
    public final Context A00;

    public C1329Uc(Context context) {
        this.A00 = context;
    }

    public final void A01(boolean z, String str, String str2, String str3, long j2) {
        ExecutorC1094La.A06.execute(new C1330Ud(this, str, z, str2, str3, j2));
    }
}
