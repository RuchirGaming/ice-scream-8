package com.mbridge.msdk.foundation.tools;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class am {

    /* JADX INFO: compiled from: Util.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final SecureRandom f20640a = new SecureRandom();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final char[] f20641b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    static String a() {
        byte[] bArr = new byte[16];
        a.f20640a.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 << 1;
            cArr[i3] = a.f20641b[(b2 >> 4) & 15];
            cArr[i3 + 1] = a.f20641b[b2 & 15];
        }
        return new String(cArr);
    }

    static int b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    static boolean a(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        return parentFile != null && (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
    }

    static byte[] b(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            throw new IllegalArgumentException("file too large, path:" + file.getPath());
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        a(file, bArr, i2);
        return bArr;
    }

    static void a(File file, byte[] bArr, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = randomAccessFile.read(bArr, i3, i2 - i3);
                if (i4 < 0) {
                    break;
                } else {
                    i3 += i4;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    static boolean a(File file, byte[] bArr) {
        try {
            File file2 = new File(file.getParent(), file.getName() + ".tmp");
            if (!a(file2)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(bArr.length);
                randomAccessFile.write(bArr);
                a(randomAccessFile);
                if (!file.exists() || file.delete()) {
                    return file2.renameTo(file);
                }
            } catch (Throwable th) {
                a(randomAccessFile);
                throw th;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    static void c(File file) {
        try {
            if (file.exists()) {
                d(file);
            }
        } catch (Exception unused) {
        }
    }

    private static void d(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        file.delete();
    }
}
