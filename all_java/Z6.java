package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.ktplay.activity.KTShareActivity;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Z6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SparseArray<Z6> f26412c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26414b;

    static {
        SparseArray<Z6> sparseArray = new SparseArray<>();
        f26412c = sparseArray;
        sparseArray.put(EnumC2016k1.EVENT_TYPE_EXCEPTION_UNHANDLED.b(), new Z6("jvm", "binder"));
        f26412c.put(EnumC2016k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), new Z6("jvm", "binder"));
        f26412c.put(EnumC2016k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b(), new Z6("jvm", KTShareActivity.EXTRA_INTENT));
        f26412c.put(EnumC2016k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), new Z6("jvm", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.b(), new Z6("jni_native", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.b(), new Z6("jni_native", com.ironsource.sdk.constants.a.h.f17727b));
        f26412c.put(EnumC2016k1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.b(), new Z6("jni_native", "binder"));
    }

    private Z6(String str, String str2) {
        this.f26413a = str;
        this.f26414b = str2;
    }

    public static Z6 a(int i2) {
        return f26412c.get(i2);
    }
}
