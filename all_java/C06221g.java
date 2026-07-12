package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C06221g extends C3P {
    @Override // com.facebook.ads.redexgen.X.C06693c
    public Object A00(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z);
    }

    @Override // com.facebook.ads.redexgen.X.C06693c
    public Object A01(int i2, int i3, boolean z, int i4) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z);
    }

    @Override // com.facebook.ads.redexgen.X.C06693c
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.facebook.ads.redexgen.X.C06693c
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
