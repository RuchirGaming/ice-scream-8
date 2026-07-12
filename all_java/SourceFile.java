package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new SourceFile() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.1
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        public String getName() {
            return null;
        }
    };

    String getName();
}
