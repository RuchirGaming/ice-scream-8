package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2248t9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2L)});
        sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2L)});
    }
}
