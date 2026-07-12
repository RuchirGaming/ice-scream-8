package com.yodo1.mas.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1MasSPUtils {
    private static final String FILE_NAME = "Yodo1Mas";
    private static Yodo1MasSPUtils instance;
    private Context appContext;
    private final SharedPreferences.Editor editor;
    private final SharedPreferences sharedPreferences;

    public Yodo1MasSPUtils(Context context) {
        if (context != null) {
            this.appContext = context.getApplicationContext();
        }
        if (this.appContext == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method method = cls.getMethod("currentActivityThread", new Class[0]);
                this.appContext = (Application) cls.getMethod("getApplication", new Class[0]).invoke(method.invoke(null, null), null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        SharedPreferences sharedPreferences = this.appContext.getSharedPreferences(FILE_NAME, 0);
        this.sharedPreferences = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    public static Yodo1MasSPUtils getInstance(Context context) {
        if (instance == null) {
            instance = new Yodo1MasSPUtils(context);
        }
        return instance;
    }

    public boolean putString(String key, String value) {
        this.editor.putString(key, value);
        return this.editor.commit();
    }

    public String getString(String key, String defaultValue) {
        return this.sharedPreferences.getString(key, defaultValue);
    }

    public boolean putBoolean(String key, boolean value) {
        this.editor.putBoolean(key, value);
        return this.editor.commit();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return this.sharedPreferences.getBoolean(key, defaultValue);
    }

    public boolean putInt(String key, int value) {
        this.editor.putInt(key, value);
        return this.editor.commit();
    }

    public int getInt(String key, int defaultValue) {
        return this.sharedPreferences.getInt(key, defaultValue);
    }

    public boolean putFloat(String key, float value) {
        this.editor.putFloat(key, value);
        return this.editor.commit();
    }

    public boolean putLong(String key, long value) {
        this.editor.putLong(key, value);
        return this.editor.commit();
    }

    public float getFloat(String key, float defaultValue) {
        return this.sharedPreferences.getFloat(key, defaultValue);
    }

    public long getLong(String key, long defaultValue) {
        return this.sharedPreferences.getLong(key, defaultValue);
    }

    public boolean checkWithKey(String key) {
        return this.sharedPreferences.contains(key);
    }
}
