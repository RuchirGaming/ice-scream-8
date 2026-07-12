package androidx.tracing;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
final class TraceApi18Impl {
    private TraceApi18Impl() {
    }

    public static void beginSection(String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
