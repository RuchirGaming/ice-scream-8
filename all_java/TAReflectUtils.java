package cn.thinkinganalyticsclone.android.utils;

import com.ironsource.sdk.constants.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TAReflectUtils {
    static String TAG = "ThinkingAnalyticsClone.TAReflectUtils";

    public static Object createObject(String className) {
        Class<?> cls;
        try {
            cls = Class.forName(className);
            try {
                return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return cls;
            }
        } catch (Exception e3) {
            e = e3;
            cls = null;
        }
    }

    public static Object getObjectInstance(String className) {
        Class<?> cls;
        try {
            cls = Class.forName(className);
            try {
                return cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return cls;
            }
        } catch (Exception e3) {
            e = e3;
            cls = null;
        }
    }

    public static Object invokeGetterMethod(Object obj, String propertyName) {
        return invokeMethod(obj, "get" + propertyName.trim(), new Object[0], new Class[0]);
    }

    public static void invokeSetterMethod(Object obj, String propertyName, Object value) {
        invokeSetterMethod(obj, propertyName, value, null);
    }

    public static void invokeSetterMethod(Object obj, String propertyName, Object value, Class<?> propertyType) {
        if (propertyType == null) {
            propertyType = value.getClass();
        }
        invokeMethod(obj, "set" + propertyName.trim(), new Object[]{value}, propertyType);
    }

    public static Object getFieldValue(final Object obj, final String fieldName) {
        Field accessibleField = getAccessibleField(obj, fieldName);
        if (accessibleField == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + a.i.f17749e);
        }
        try {
            return accessibleField.get(obj);
        } catch (IllegalAccessException e2) {
            TDLog.e(TAG, e2.getMessage());
            return null;
        }
    }

    public static void setFieldValue(final Object obj, final String fieldName, final Object value) {
        Field accessibleField = getAccessibleField(obj, fieldName);
        if (accessibleField == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + a.i.f17749e);
        }
        try {
            accessibleField.set(obj, value);
        } catch (IllegalAccessException e2) {
            TDLog.e(TAG, e2.getMessage());
        }
    }

    public static Field getAccessibleField(final Object obj, final String fieldName) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            if (superclass != null) {
                try {
                    Field declaredField = superclass.getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static Object invokeMethod(final Object obj, final String methodName, final Object[] args, final Class<?>... parameterTypes) {
        Method accessibleMethod = getAccessibleMethod(obj, methodName, parameterTypes);
        if (accessibleMethod == null) {
            TDLog.i(TAG, "Could not find method [" + methodName + "] on target [" + obj + a.i.f17749e);
            return null;
        }
        try {
            return accessibleMethod.invoke(obj, args);
        } catch (Exception e2) {
            TDLog.e(TAG, e2.getMessage());
            return null;
        }
    }

    public static Method getAccessibleMethod(final Object obj, final String methodName, final Class<?>... parameterTypes) {
        if (obj == null) {
            TDLog.i(TAG, "obj is null!");
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(methodName, parameterTypes);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    public static <T> Class<T> getSuperClassGenericType(final Class clazz) {
        return getSuperClassGenericType(clazz, 0);
    }

    public static Class getSuperClassGenericType(final Class clazz, final int index) {
        Type genericSuperclass = clazz.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            TDLog.w(TAG, clazz.getSimpleName() + "'s superclass not ParameterizedType");
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        if (index >= actualTypeArguments.length || index < 0) {
            TDLog.w(TAG, "Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: " + actualTypeArguments.length);
            return Object.class;
        }
        if (!(actualTypeArguments[index] instanceof Class)) {
            TDLog.w(TAG, clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
            return Object.class;
        }
        return (Class) actualTypeArguments[index];
    }
}
