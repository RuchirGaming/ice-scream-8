package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f19386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f19387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f19388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f19389d;

    SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f19386a = method;
        this.f19387b = threadMode;
        this.f19388c = cls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f19389d.equals(((SubscriberMethod) obj).f19389d);
    }

    private synchronized void a() {
        if (this.f19389d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f19386a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f19386a.getName());
            sb.append('(');
            sb.append(this.f19388c.getName());
            this.f19389d = sb.toString();
        }
    }

    public final int hashCode() {
        return this.f19386a.hashCode();
    }
}
