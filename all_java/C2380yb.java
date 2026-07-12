package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2380yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f28575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28576b;

    public C2380yb(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        return "AmountWrapper{amount=" + this.f28575a + ", unit='" + this.f28576b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public C2380yb(BigDecimal bigDecimal, String str) {
        this.f28575a = bigDecimal;
        this.f28576b = str;
    }
}
