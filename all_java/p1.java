package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f11931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f11932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f11934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f11935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f11936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f11937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f11938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f11939j;

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f11940a;

        public d(Unsafe unsafe) {
            this.f11940a = unsafe;
        }

        public abstract byte a(long j2);

        public abstract void a(long j2, byte[] bArr, long j3, long j4);

        public abstract void a(Object obj, long j2, byte b2);

        public abstract void a(Object obj, long j2, double d2);

        public abstract void a(Object obj, long j2, float f2);

        public abstract void a(Object obj, long j2, boolean z);

        public boolean a() {
            Unsafe unsafe = this.f11940a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                p1.a(th);
                return false;
            }
        }

        public abstract boolean a(Object obj, long j2);

        public abstract byte b(Object obj, long j2);

        public abstract boolean b();

        public abstract double c(Object obj, long j2);

        public abstract float d(Object obj, long j2);
    }

    static {
        Unsafe unsafe;
        d cVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f11930a = unsafe;
        f11931b = com.fyber.inneractive.sdk.protobuf.d.f11808a;
        boolean zC = c(Long.TYPE);
        f11932c = zC;
        boolean zC2 = c(Integer.TYPE);
        f11933d = zC2;
        if (unsafe != null) {
            if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
                cVar = new c(unsafe);
            } else if (zC) {
                cVar = new b(unsafe);
            } else if (zC2) {
                cVar = new a(unsafe);
            }
        }
        f11934e = cVar;
        f11935f = cVar == null ? false : cVar.b();
        f11936g = cVar == null ? false : cVar.a();
        f11937h = a((Class<?>) byte[].class);
        a((Class<?>) boolean[].class);
        b(boolean[].class);
        a((Class<?>) int[].class);
        b(int[].class);
        a((Class<?>) long[].class);
        b(long[].class);
        a((Class<?>) float[].class);
        b(float[].class);
        a((Class<?>) double[].class);
        b(double[].class);
        a((Class<?>) Object[].class);
        b(Object[].class);
        Field fieldA = a();
        f11938i = (fieldA == null || cVar == null) ? -1L : cVar.f11940a.objectFieldOffset(fieldA);
        f11939j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class<?> cls) {
        if (f11936g) {
            return f11934e.f11940a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int b(Class<?> cls) {
        if (f11936g) {
            return f11934e.f11940a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static boolean c(Class<?> cls) {
        if (!com.fyber.inneractive.sdk.protobuf.d.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f11931b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte d(Object obj, long j2) {
        return (byte) ((e(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static int e(Object obj, long j2) {
        return f11934e.f11940a.getInt(obj, j2);
    }

    public static long f(Object obj, long j2) {
        return f11934e.f11940a.getLong(obj, j2);
    }

    public static Object g(Object obj, long j2) {
        return f11934e.f11940a.getObject(obj, j2);
    }

    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, byte b2) {
            if (p1.f11939j) {
                p1.a(obj, j2, b2);
            } else {
                p1.b(obj, j2, b2);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j2) {
            return p1.f11939j ? p1.c(obj, j2) : p1.d(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j2) {
            return Double.longBitsToDouble(this.f11940a.getLong(obj, j2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j2) {
            return Float.intBitsToFloat(this.f11940a.getInt(obj, j2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j2) {
            if (p1.f11939j) {
                return p1.a(obj, j2);
            }
            return p1.b(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, boolean z) {
            if (p1.f11939j) {
                p1.a(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                p1.b(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, float f2) {
            this.f11940a.putInt(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, double d2) {
            this.f11940a.putLong(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, byte b2) {
            if (p1.f11939j) {
                p1.a(obj, j2, b2);
            } else {
                p1.b(obj, j2, b2);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j2) {
            return p1.f11939j ? p1.c(obj, j2) : p1.d(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean b() {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j2) {
            return Double.longBitsToDouble(this.f11940a.getLong(obj, j2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j2) {
            return Float.intBitsToFloat(this.f11940a.getInt(obj, j2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j2) {
            if (p1.f11939j) {
                return p1.a(obj, j2);
            }
            return p1.b(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, boolean z) {
            if (p1.f11939j) {
                p1.a(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                p1.b(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, float f2) {
            this.f11940a.putInt(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, double d2) {
            this.f11940a.putLong(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }
    }

    public static void a(Object obj, long j2, int i2) {
        f11934e.f11940a.putInt(obj, j2, i2);
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (e(obj, j3) & (~(255 << i2))));
    }

    public static void a(Object obj, long j2, long j3) {
        f11934e.f11940a.putLong(obj, j2, j3);
    }

    public static void a(Object obj, long j2, boolean z) {
        f11934e.a(obj, j2, z);
    }

    public static boolean b(Object obj, long j2) {
        return d(obj, j2) != 0;
    }

    public static void a(Object obj, long j2, float f2) {
        f11934e.a(obj, j2, f2);
    }

    public static void a(Object obj, long j2, double d2) {
        f11934e.a(obj, j2, d2);
    }

    public static void a(Object obj, long j2, Object obj2) {
        f11934e.f11940a.putObject(obj, j2, obj2);
    }

    public static byte a(byte[] bArr, long j2) {
        return f11934e.b(bArr, f11937h + j2);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        f11934e.a((Object) bArr, f11937h + j2, b2);
    }

    public static long a(ByteBuffer byteBuffer) {
        d dVar = f11934e;
        return dVar.f11940a.getLong(byteBuffer, f11938i);
    }

    public static byte c(Object obj, long j2) {
        return (byte) ((e(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        if (com.fyber.inneractive.sdk.protobuf.d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a() {
            if (!super.a()) {
                return false;
            }
            try {
                Class<?> cls = this.f11940a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                p1.a(th);
                return false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002e  */
        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean b() {
            boolean z;
            Unsafe unsafe = this.f11940a;
            if (unsafe == null) {
                z = false;
            } else {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    cls.getMethod("getLong", Object.class, Long.TYPE);
                    if (p1.a() == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    p1.a(th);
                }
            }
            if (!z) {
                return false;
            }
            try {
                Class<?> cls2 = this.f11940a.getClass();
                Class<?> cls3 = Long.TYPE;
                cls2.getMethod("getByte", cls3);
                cls2.getMethod("putByte", cls3, Byte.TYPE);
                cls2.getMethod("getInt", cls3);
                cls2.getMethod("putInt", cls3, Integer.TYPE);
                cls2.getMethod("getLong", cls3);
                cls2.getMethod("putLong", cls3, cls3);
                cls2.getMethod("copyMemory", cls3, cls3, cls3);
                cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                return true;
            } catch (Throwable th2) {
                p1.a(th2);
                return false;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public double c(Object obj, long j2) {
            return this.f11940a.getDouble(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public float d(Object obj, long j2) {
            return this.f11940a.getFloat(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, byte b2) {
            this.f11940a.putByte(obj, j2, b2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public boolean a(Object obj, long j2) {
            return this.f11940a.getBoolean(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, boolean z) {
            this.f11940a.putBoolean(obj, j2, z);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, float f2) {
            this.f11940a.putFloat(obj, j2, f2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(Object obj, long j2, double d2) {
            this.f11940a.putDouble(obj, j2, d2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte a(long j2) {
            return this.f11940a.getByte(j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public byte b(Object obj, long j2) {
            return this.f11940a.getByte(obj, j2);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p1.d
        public void a(long j2, byte[] bArr, long j3, long j4) {
            this.f11940a.copyMemory((Object) null, j2, bArr, p1.f11937h + j3, j4);
        }
    }

    public static void a(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iE = e(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (iE & (~(255 << i2))));
    }

    public static boolean a(Object obj, long j2) {
        return c(obj, j2) != 0;
    }

    public static void a(Throwable th) {
        Logger.getLogger(p1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
