package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1803bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1778ac f26606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1867e1 f26607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26608c;

    public C1803bc() {
        this(null, EnumC1867e1.UNKNOWN, "identifier info has never been updated");
    }

    public boolean a() {
        C1778ac c1778ac = this.f26606a;
        return (c1778ac == null || TextUtils.isEmpty(c1778ac.f26518b)) ? false : true;
    }

    public String toString() {
        return "AdTrackingInfoResult{mAdTrackingInfo=" + this.f26606a + ", mStatus=" + this.f26607b + ", mErrorExplanation='" + this.f26608c + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public C1803bc(C1778ac c1778ac, EnumC1867e1 enumC1867e1, String str) {
        this.f26606a = c1778ac;
        this.f26607b = enumC1867e1;
        this.f26608c = str;
    }
}
