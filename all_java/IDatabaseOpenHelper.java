package com.mbridge.msdk.foundation.download.database;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface IDatabaseOpenHelper {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
