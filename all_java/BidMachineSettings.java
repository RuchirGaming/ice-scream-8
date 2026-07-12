package io.bidmachine;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
class BidMachineSettings {
    private static boolean showWithoutInternet;

    BidMachineSettings() {
    }

    static boolean isShowWithoutInternet() {
        return showWithoutInternet;
    }

    static void setShowWithoutInternet(boolean z) {
        showWithoutInternet = z;
    }
}
