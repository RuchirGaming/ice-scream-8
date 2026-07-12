package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class w11 {
    public static <T> T a(Class<T> cls, Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            boolean zIsAccessible = declaredConstructor.isAccessible();
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(true);
            }
            T tNewInstance = declaredConstructor.newInstance(objArr);
            if (!zIsAccessible) {
                declaredConstructor.setAccessible(false);
            }
            return tNewInstance;
        } catch (Throwable unused) {
            Arrays.toString(objArr);
            return null;
        }
    }

    private static Object a(Object obj, Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        Object objInvoke;
        Method method;
        loop0: while (true) {
            objInvoke = null;
            if (cls == null) {
                method = null;
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                for (int i2 = 0; i2 < length; i2++) {
                    method = declaredMethods[i2];
                    if (str.equals(method.getName()) && a(method, clsArr)) {
                        break loop0;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Throwable unused) {
                return objInvoke;
            }
        }
        if (method == null) {
            return null;
        }
        method.setAccessible(true);
        objInvoke = method.invoke(obj, objArr);
        method.setAccessible(false);
        return objInvoke;
    }

    private static boolean a(Method method, Class<?>[] clsArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (!parameterTypes[i2].isAssignableFrom(clsArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public static Object a(Object obj, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        return a(obj, obj.getClass(), str, clsArr, objArr);
    }

    public static Object a(Class cls, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            clsArr[i2] = objArr[i2].getClass();
        }
        return a(null, cls, str, clsArr, objArr);
    }
}
