package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class U2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Wn f25932a = new Wn();

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? IdManager.DEFAULT_VERSION_NAME : packageInfo.versionName;
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static int b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public static <K, V> Map<K, V> c(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public static boolean a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    public static boolean b(Map map) {
        return map == null || map.size() == 0;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    public static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    public static Set<Integer> a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i2 : iArr) {
            hashSet.add(Integer.valueOf(i2));
        }
        return hashSet;
    }

    public static String a(String str, int i2) {
        if (str == null) {
            return null;
        }
        return str.length() > i2 ? str.substring(0, i2) : str;
    }

    public static List<String> a(String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static Object a(Wm wm, Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return wm.a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, S> S a(Wm<T, S> wm, Context context, String str, String str2, String str3) {
        try {
            return (S) a((Wm) wm, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <K, V> List<Map.Entry<K, V>> a(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> a(List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry<K, V> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static <T> List<T> a(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    public static BigDecimal a(long j2) {
        return new BigDecimal(j2).divide(new BigDecimal(1000000), 6, 6);
    }

    public static double a(double d2, double d3) {
        return (Double.isNaN(d2) || Double.isInfinite(d2)) ? d3 : d2;
    }
}
