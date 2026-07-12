package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class qo1 implements dh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34363e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34367d;

    static {
        qo1$$ExternalSyntheticLambda0 qo1__externalsyntheticlambda0 = new dh.a() { // from class: com.yandex.mobile.ads.impl.qo1$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.dh.a
            public final dh fromBundle(Bundle bundle) {
                return qo1.a(bundle);
            }
        };
    }

    public qo1(int i2, int i3, int i4, float f2) {
        this.f34364a = i2;
        this.f34365b = i3;
        this.f34366c = i4;
        this.f34367d = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qo1 a(Bundle bundle) {
        return new qo1(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo1)) {
            return false;
        }
        qo1 qo1Var = (qo1) obj;
        return this.f34364a == qo1Var.f34364a && this.f34365b == qo1Var.f34365b && this.f34366c == qo1Var.f34366c && this.f34367d == qo1Var.f34367d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f34367d) + ((((((this.f34364a + 217) * 31) + this.f34365b) * 31) + this.f34366c) * 31);
    }
}
