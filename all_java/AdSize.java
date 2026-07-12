package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.impl.sf;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class AdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28856b;

    public AdSize(int i2, int i3) {
        this.f28855a = i2;
        this.f28856b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f28855a == adSize.f28855a && this.f28856b == adSize.f28856b;
    }

    public int getHeight() {
        return this.f28856b;
    }

    public int getWidth() {
        return this.f28855a;
    }

    public int hashCode() {
        return (this.f28855a * 31) + this.f28856b;
    }

    public String toString() {
        StringBuilder sbA = sf.a("AdSize{mWidth=");
        sbA.append(this.f28855a);
        sbA.append(", mHeight=");
        sbA.append(this.f28856b);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }
}
