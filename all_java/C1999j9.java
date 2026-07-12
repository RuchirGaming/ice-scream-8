package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1999j9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ");
        sb.append("reports");
        sb.append(" ADD COLUMN ");
        sb.append("session_type");
        sb.append(" INTEGER DEFAULT ");
        EnumC2400z6 enumC2400z6 = EnumC2400z6.FOREGROUND;
        sb.append(enumC2400z6.a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append("reports");
        sb2.append(" SET ");
        sb2.append("session_type");
        sb2.append(" = ");
        EnumC2400z6 enumC2400z7 = EnumC2400z6.BACKGROUND;
        sb2.append(enumC2400z7.a());
        sb2.append(" WHERE ");
        sb2.append("session_id");
        sb2.append(" = ");
        sb2.append(-2L);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN type INTEGER DEFAULT " + enumC2400z6.a());
        sQLiteDatabase.execSQL("UPDATE sessions SET type = " + enumC2400z7.a() + " WHERE id = -2");
    }
}
