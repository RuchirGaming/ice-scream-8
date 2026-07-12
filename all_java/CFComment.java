package org.checkerframework.framework.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface CFComment {
    String[] value();
}
