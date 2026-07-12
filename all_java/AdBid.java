package sg.bigo.ads.api;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface AdBid {
    public static final int LOSS_REASON_INTERNAL_ERROR = 1;
    public static final int LOSS_REASON_LOWER_THAN_FLOOR_PRICE = 100;
    public static final int LOSS_REASON_LOWER_THAN_HIGHEST_PRICE = 101;
    public static final int LOSS_REASON_TIMEOUT = 2;

    double getPrice();

    void notifyLoss(Double d2, String str, int i2);

    void notifyWin(Double d2, String str);
}
