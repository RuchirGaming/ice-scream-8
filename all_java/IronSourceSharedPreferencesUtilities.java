package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class IronSourceSharedPreferencesUtilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f15436a = "_preferences";

    static int a(Context context, String str, String str2, int i2) {
        return context == null ? i2 : context.getSharedPreferences(str, 0).getInt(str2, i2);
    }

    static void a(Context context, String str, String str2, boolean z) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putBoolean(str2, z);
        editorEdit.apply();
    }

    public static boolean getBooleanFromSharedPrefs(Context context, String str, String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    public static String getDefaultSharedPrefName(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f15436a;
    }

    public static int getIntFromDefaultSharedPrefs(Context context, String str, int i2) {
        return a(context, getDefaultSharedPrefName(context, ""), str, i2);
    }

    public static String getStringFromDefaultSharedPrefs(Context context, String str, String str2) {
        return getStringFromSharedPrefs(context, getDefaultSharedPrefName(context, ""), str, str2);
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveIntToSharedPrefs(Context context, String str, String str2, int i2) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putInt(str2, i2);
        editorEdit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }
}
