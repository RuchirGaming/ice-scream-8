package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: NameResolver.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface NameResolver {
    String getQualifiedClassName(int i2);

    String getString(int i2);

    boolean isLocalClassName(int i2);
}
