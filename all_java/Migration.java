package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public abstract void migrate(SupportSQLiteDatabase supportSQLiteDatabase);

    public Migration(int i2, int i3) {
        this.startVersion = i2;
        this.endVersion = i3;
    }
}
