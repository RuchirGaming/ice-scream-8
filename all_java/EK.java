package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class EK extends ZK {
    @Override // com.facebook.ads.redexgen.X.C3Z
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.X.C3Z
    public final void A01(AccessibilityEvent accessibilityEvent, int i2) {
        accessibilityEvent.setContentChangeTypes(i2);
    }
}
