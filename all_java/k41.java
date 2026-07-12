package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DecimalFormat f32157a;

    public k41() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f32157a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws ho0 {
        try {
            return this.f32157a.format(Long.valueOf(!TextUtils.isEmpty(str) ? str.replaceAll(" ", "") : str));
        } catch (NumberFormatException unused) {
            String.format("Could not parse review count value. Review Count value is %s", str);
            int i2 = ga0.f30971a;
            throw new ho0("Native Ad json has not required attributes");
        }
    }
}
