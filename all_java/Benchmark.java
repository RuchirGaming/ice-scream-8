package com.facebook.ads.internal.bench;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
@Retention(RetentionPolicy.CLASS)
public @interface Benchmark {
    int failAtMillis() default Integer.MAX_VALUE;

    int warnAtMillis() default Integer.MAX_VALUE;
}
