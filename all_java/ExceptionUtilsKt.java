package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: exceptionUtils.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final class ExceptionUtilsKt {
    public static final RuntimeException rethrow(Throwable e2) throws Throwable {
        Intrinsics.checkNotNullParameter(e2, "e");
        throw e2;
    }

    public static final boolean isProcessCanceledException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class<?> superclass = th.getClass();
        while (!Intrinsics.areEqual(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }
}
