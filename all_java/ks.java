package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ks implements dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32344c;

    static {
        ks$$ExternalSyntheticLambda0 ks__externalsyntheticlambda0 = new dh.a() { // from class: com.yandex.mobile.ads.impl.ks$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.dh.a
            public final dh fromBundle(Bundle bundle) {
                return ks.a(bundle);
            }
        };
    }

    public ks(int i2, int i3, int i4) {
        this.f32342a = i2;
        this.f32343b = i3;
        this.f32344c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ks a(Bundle bundle) {
        return new ks(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        return this.f32342a == ksVar.f32342a && this.f32343b == ksVar.f32343b && this.f32344c == ksVar.f32344c;
    }

    public final int hashCode() {
        return ((((this.f32342a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f32343b) * 31) + this.f32344c;
    }
}
