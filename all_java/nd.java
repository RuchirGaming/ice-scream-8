package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33073a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33074b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nd.class != obj.getClass()) {
            return false;
        }
        nd ndVar = (nd) obj;
        return this.f33073a == ndVar.f33073a && Float.compare(ndVar.f33074b, this.f33074b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f33074b) + ((this.f33073a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
