package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class KI {
    public static byte[] A00;
    public static String[] A01 = {"4Hyw1ld0", "fEzx6YE0SeCvem7jc58qc1uowK5CeHyF", "mKjUZIiYyhCBAWVMkGfhIPNFhY8yjY7b", "XoO13E9Z", "T5DEyuoaMCuUHewoghibS1K19XR2WHTa", "iIUB3596vuf", "PRfLmBQ8OOom6oFwc8jxiiNxNKuVVsiK", "TWoMGSFYHQz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static KH A00() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(A03(8, 26, 93));
        Object objInvoke = cls.getMethod(A03(66, 21, 92), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(A03(87, 11, 69));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(objInvoke);
        if (map == null) {
            return KH.A0B;
        }
        for (Object obj : map.values()) {
            Field declaredField2 = obj.getClass().getDeclaredField(A03(0, 8, 87));
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity.isTaskRoot() && activity.getIntent().getCategories().contains(A03(34, 32, 84))) {
                return KH.A06;
            }
        }
        return KH.A09;
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A01[4].charAt(13) == '3') {
                throw new RuntimeException();
            }
            A01[2] = "lr9od7US3THgayVRC3YximplGEeGYREs";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{60, 62, 41, 52, 43, 52, 41, 36, 54, 57, 51, 37, 56, 62, 51, 121, 54, 39, 39, 121, 22, 52, 35, 62, 33, 62, 35, 46, 3, Utf8.REPLACEMENT_BYTE, 37, 50, 54, 51, Utf8.REPLACEMENT_BYTE, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 42, 59, 57, 49, 44, 39, 112, 18, 31, 11, 16, 29, 22, 27, 12, 53, 35, 36, 36, 51, 56, 34, 23, 53, 34, Utf8.REPLACEMENT_BYTE, 32, Utf8.REPLACEMENT_BYTE, 34, 47, 2, 62, 36, 51, 55, 50, 34, 14, 44, 59, 38, 57, 38, 59, 38, 42, 60};
    }

    static {
        A04();
    }

    public static KH A01(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return A02(context);
            }
            return A00();
        } catch (Exception unused) {
            return KH.A04;
        }
    }

    public static KH A02(Context context) {
        if (context == null) {
            return KH.A0C;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A03(0, 8, 87));
        if (mgr == null) {
            return KH.A07;
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return KH.A0A;
        }
        Iterator<ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null) {
                Set<String> categories = taskInfo.baseIntent.getCategories();
                if (A01[4].charAt(13) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "rbRaEFWiZz7";
                strArr[5] = "WgbgXmtUXm5";
                if (categories != null && taskInfo.baseIntent.getCategories().contains(A03(34, 32, 84))) {
                    return KH.A05;
                }
            }
        }
        return KH.A08;
    }
}
