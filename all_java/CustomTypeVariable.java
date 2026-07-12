package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface CustomTypeVariable {
    boolean isTypeVariable();

    KotlinType substitutionResult(KotlinType kotlinType);
}
