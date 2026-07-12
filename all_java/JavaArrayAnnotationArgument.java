package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;

/* JADX INFO: compiled from: annotationArguments.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface JavaArrayAnnotationArgument extends JavaAnnotationArgument {
    List<JavaAnnotationArgument> getElements();
}
