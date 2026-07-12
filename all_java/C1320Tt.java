package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C1320Tt extends LU {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C1320Tt(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.X.LU, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
