package bitter.jnibridge;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class JNIBridge {

    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f41a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f42b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor f43c;

        public a(long j2) {
            this.f42b = j2;
            try {
                Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                this.f43c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
                this.f43c = null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f41a) {
                long j2 = this.f42b;
                if (j2 == 0) {
                    return null;
                }
                try {
                    return JNIBridge.invoke(j2, method.getDeclaringClass(), method, objArr);
                } catch (NoSuchMethodError e2) {
                    if (this.f43c == null) {
                        System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                        throw e2;
                    }
                    if ((method.getModifiers() & 1024) != 0) {
                        throw e2;
                    }
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    Class<?> declaringClass = method.getDeclaringClass();
                    return ((MethodHandles.Lookup) this.f43c.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
                }
            }
        }
    }

    static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            a aVar = (a) Proxy.getInvocationHandler(obj);
            synchronized (aVar.f41a) {
                aVar.f42b = 0L;
            }
        }
    }

    static native Object invoke(long j2, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j2, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new a(j2));
    }
}
