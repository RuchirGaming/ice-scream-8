package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzamm {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    private static final class zza extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, boolean z) {
            if (zzamm.zza) {
                zzamm.zza(obj, j2, z);
            } else {
                zzamm.zzb(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, byte b2) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j2, b2);
            } else {
                zzamm.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j2) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j2);
            }
            return zzamm.zzg(obj, j2);
        }
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    private static final class zzb extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, boolean z) {
            if (zzamm.zza) {
                zzamm.zza(obj, j2, z);
            } else {
                zzamm.zzb(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, byte b2) {
            if (zzamm.zza) {
                zzamm.zzc(obj, j2, b2);
            } else {
                zzamm.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j2) {
            if (zzamm.zza) {
                return zzamm.zzf(obj, j2);
            }
            return zzamm.zzg(obj, j2);
        }
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
    private static abstract class zzc {
        Unsafe zza;

        public abstract double zza(Object obj, long j2);

        public abstract void zza(Object obj, long j2, byte b2);

        public abstract void zza(Object obj, long j2, double d2);

        public abstract void zza(Object obj, long j2, float f2);

        public abstract void zza(Object obj, long j2, boolean z);

        public abstract float zzb(Object obj, long j2);

        public abstract boolean zzc(Object obj, long j2);

        public final int zzd(Object obj, long j2) {
            return this.zza.getInt(obj, j2);
        }

        public final long zze(Object obj, long j2) {
            return this.zza.getLong(obj, j2);
        }

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public final void zza(Object obj, long j2, int i2) {
            this.zza.putInt(obj, j2, i2);
        }

        public final void zza(Object obj, long j2, long j3) {
            this.zza.putLong(obj, j2, j3);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                zzamm.zza(th);
                return false;
            }
        }

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamm.zze() != null;
            } catch (Throwable th) {
                zzamm.zza(th);
                return false;
            }
        }
    }

    static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    static long zzd(Object obj, long j2) {
        return zzf.zze(obj, j2);
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object zze(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaml());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamm.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static /* synthetic */ void zza(Object obj, long j2, boolean z) {
        zzc(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void zzb(Object obj, long j2, boolean z) {
        zzd(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    static {
        zzc zzbVar;
        Unsafe unsafeZzb = zzb();
        zzb = unsafeZzb;
        zzc = zzahl.zza();
        boolean zZzd = zzd(Long.TYPE);
        zzd = zZzd;
        boolean zZzd2 = zzd(Integer.TYPE);
        zze = zZzd2;
        if (unsafeZzb == null) {
            zzbVar = null;
        } else if (zZzd) {
            zzbVar = new zza(unsafeZzb);
        } else if (zZzd2) {
            zzbVar = new zzb(unsafeZzb);
        } else {
            zzbVar = null;
        }
        zzf = zzbVar;
        zzg = zzbVar == null ? false : zzbVar.zzb();
        zzh = zzbVar == null ? false : zzbVar.zza();
        long jZzb = zzb(byte[].class);
        zzi = jZzb;
        zzj = zzb(boolean[].class);
        zzk = zzc(boolean[].class);
        zzl = zzb(int[].class);
        zzm = zzc(int[].class);
        zzn = zzb(long[].class);
        zzo = zzc(long[].class);
        zzp = zzb(float[].class);
        zzq = zzc(float[].class);
        zzr = zzb(double[].class);
        zzs = zzc(double[].class);
        zzt = zzb(Object[].class);
        zzu = zzc(Object[].class);
        Field fieldZze = zze();
        zzv = (fieldZze == null || zzbVar == null) ? -1L : zzbVar.zza.objectFieldOffset(fieldZze);
        zzw = (int) (7 & jZzb);
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzamm() {
    }

    static void zzc(Object obj, long j2, boolean z) {
        zzf.zza(obj, j2, z);
    }

    static void zza(byte[] bArr, long j2, byte b2) {
        zzf.zza((Object) bArr, zzi + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iZzc = zzc(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (iZzc & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (zzc(obj, j3) & (~(255 << i2))));
    }

    static void zza(Object obj, long j2, double d2) {
        zzf.zza(obj, j2, d2);
    }

    static void zza(Object obj, long j2, float f2) {
        zzf.zza(obj, j2, f2);
    }

    static void zza(Object obj, long j2, int i2) {
        zzf.zza(obj, j2, i2);
    }

    static void zza(Object obj, long j2, long j3) {
        zzf.zza(obj, j2, j3);
    }

    static void zza(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    static /* synthetic */ boolean zzf(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j2) {
        return ((byte) (zzc(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)))) != 0;
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzh(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    static boolean zzc() {
        return zzh;
    }

    static boolean zzd() {
        return zzg;
    }
}
