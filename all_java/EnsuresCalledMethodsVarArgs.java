package org.checkerframework.checker.calledmethods.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface EnsuresCalledMethodsVarArgs {
    String[] value();
}
