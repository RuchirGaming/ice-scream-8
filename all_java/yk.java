package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class yk implements dh {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dh.a<yk> f36954f = new dh.a() { // from class: com.yandex.mobile.ads.impl.yk$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.dh.a
        public final dh fromBundle(Bundle bundle) {
            return yk.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f36958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36959e;

    public yk(int i2, int i3, int i4, byte[] bArr) {
        this.f36955a = i2;
        this.f36956b = i3;
        this.f36957c = i4;
        this.f36958d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static yk a(Bundle bundle) {
        return new yk(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yk.class != obj.getClass()) {
            return false;
        }
        yk ykVar = (yk) obj;
        return this.f36955a == ykVar.f36955a && this.f36956b == ykVar.f36956b && this.f36957c == ykVar.f36957c && Arrays.equals(this.f36958d, ykVar.f36958d);
    }

    public final int hashCode() {
        if (this.f36959e == 0) {
            this.f36959e = Arrays.hashCode(this.f36958d) + ((((((this.f36955a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f36956b) * 31) + this.f36957c) * 31);
        }
        return this.f36959e;
    }

    public final String toString() {
        StringBuilder sbA = sf.a("ColorInfo(");
        sbA.append(this.f36955a);
        sbA.append(", ");
        sbA.append(this.f36956b);
        sbA.append(", ");
        sbA.append(this.f36957c);
        sbA.append(", ");
        sbA.append(this.f36958d != null);
        sbA.append(")");
        return sbA.toString();
    }
}
