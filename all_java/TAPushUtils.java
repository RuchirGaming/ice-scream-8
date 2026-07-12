package cn.thinkinganalyticsclone.android.aop.push;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TAPushUtils {
    public static String getJPushSource(int sdk) {
        if (sdk == 1) {
            return "Xiaomi";
        }
        if (sdk == 2) {
            return "HUAWEI";
        }
        if (sdk == 3) {
            return "Meizu";
        }
        if (sdk == 4) {
            return "OPPO";
        }
        if (sdk != 5) {
            return null;
        }
        return "vivo";
    }
}
