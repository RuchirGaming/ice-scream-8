package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class C06783l {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3j] */
    public static C06763j A00(final InterfaceC06773k interfaceC06773k) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3j
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
                return (AccessibilityNodeInfo) interfaceC06773k.A4T(i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
                return interfaceC06773k.A5c(str, i2);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i2, int i3, Bundle bundle) {
                return interfaceC06773k.ADn(i2, i3, bundle);
            }
        };
    }
}
