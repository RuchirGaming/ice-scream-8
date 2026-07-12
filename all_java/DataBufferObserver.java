package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface DataBufferObserver {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i2, int i3);

    void onDataRangeInserted(int i2, int i3);

    void onDataRangeMoved(int i2, int i3, int i4);

    void onDataRangeRemoved(int i2, int i3);
}
