package com.bykv.vk.openvk.preload.geckox.utils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class CloseableUtils {
    public static boolean close(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException e2) {
            com.bykv.vk.openvk.preload.geckox.h.b.b("gecko-debug-tag", "close:", e2);
            return false;
        }
    }

    public static boolean close(Cursor cursor) {
        if (cursor == null) {
            return true;
        }
        try {
            cursor.close();
            return true;
        } catch (Exception e2) {
            com.bykv.vk.openvk.preload.geckox.h.b.b("gecko-debug-tag", "close:", e2);
            return false;
        }
    }

    public static boolean close(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            sQLiteDatabase.close();
            return true;
        } catch (Exception e2) {
            com.bykv.vk.openvk.preload.geckox.h.b.b("gecko-debug-tag", "close:", e2);
            return false;
        }
    }
}
