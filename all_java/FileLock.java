package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f1497a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1499c;

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i2) throws Exception;

    private static native void nLockFileSegment(int i2, int i3) throws Exception;

    private static native void nRelease(int i2) throws Exception;

    private static native boolean nTryLock(int i2) throws Exception;

    private static native void nUnlockFile(int i2) throws Exception;

    static {
        System.loadLibrary("file_lock_pg");
    }

    private FileLock(String str, int i2) {
        this.f1499c = str;
        this.f1498b = i2;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e2.getMessage());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e2) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e2.getMessage());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (!nTryLock(iD)) {
                new FileLock(str, iD).b();
                return null;
            }
            return new FileLock(str, iD);
        } catch (Exception e2) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e2.getMessage());
        }
    }

    public static FileLock a(String str, int i2) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i2);
            return new FileLock(str, iD);
        } catch (Exception e2) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e2.getMessage());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f1497a;
        synchronized (map) {
            numValueOf = map.get(str);
            if (numValueOf == null) {
                new File(str).getParentFile().mkdirs();
                numValueOf = Integer.valueOf(nGetFD(str));
                map.put(str, numValueOf);
            }
        }
        return numValueOf.intValue();
    }

    public final void a() {
        try {
            nUnlockFile(this.f1498b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f1499c);
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f1497a;
        synchronized (map) {
            numRemove = map.remove(this.f1499c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e2) {
            throw new RuntimeException("release lock failed, file:" + this.f1499c + " caused by:" + e2.getMessage());
        }
    }
}
