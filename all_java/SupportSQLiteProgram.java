package androidx.sqlite.db;

import java.io.Closeable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int i2, byte[] bArr);

    void bindDouble(int i2, double d2);

    void bindLong(int i2, long j2);

    void bindNull(int i2);

    void bindString(int i2, String str);

    void clearBindings();
}
