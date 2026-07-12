package cn.thinkinganalyticsclone.android.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class EmulatorDetector {
    public static boolean isEmulator() {
        return mayOnEmulatorViaQEMU() || isEmulatorFromAbi();
    }

    private static boolean mayOnEmulatorViaQEMU() {
        return "1".equals(getProp("ro.kernel.qemu"));
    }

    private static boolean isEmulatorFromAbi() {
        String prop = getProp("ro.product.cpu.abi");
        return (prop == null || TextUtils.isEmpty(prop) || !prop.contains("x86")) ? false : true;
    }

    private static String getProp(String property) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, property);
        } catch (Exception unused) {
            return null;
        }
    }
}
