package androidx.room.util;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class SneakyThrow {
    public static void reThrow(Exception exc) throws Throwable {
        sneakyThrow(exc);
    }

    private static <E extends Throwable> void sneakyThrow(Throwable th) throws Throwable {
        throw th;
    }

    private SneakyThrow() {
    }
}
