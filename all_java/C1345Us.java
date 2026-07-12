package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C1345Us implements HV {
    public final Handler A00;

    public C1345Us(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Looper A7D() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAF(int i2, int i3, int i4) {
        return this.A00.obtainMessage(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAG(int i2, int i3, int i4, Object obj) {
        return this.A00.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final Message AAH(int i2, Object obj) {
        return this.A00.obtainMessage(i2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final void AEY(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final boolean AF2(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.facebook.ads.redexgen.X.HV
    public final boolean AF3(int i2, long j2) {
        return this.A00.sendEmptyMessageAtTime(i2, j2);
    }
}
