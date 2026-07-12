package com.yandex.metrica.ecommerce;

import com.inmobi.commons.core.configs.TelemetryConfig;
import com.yandex.metrica.impl.ob.U2;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class ECommerceAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BigDecimal f24406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24407b;

    public ECommerceAmount(long j2, String str) {
        this(U2.a(j2), str);
    }

    public BigDecimal getAmount() {
        return this.f24406a;
    }

    public String getUnit() {
        return this.f24407b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f24406a + ", unit='" + this.f24407b + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public ECommerceAmount(double d2, String str) {
        this(new BigDecimal(U2.a(d2, TelemetryConfig.DEFAULT_SAMPLING_FACTOR)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f24406a = bigDecimal;
        this.f24407b = str;
    }
}
