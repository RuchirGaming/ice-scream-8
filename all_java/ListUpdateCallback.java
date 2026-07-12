package androidx.recyclerview.widget;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ListUpdateCallback {
    void onChanged(int i2, int i3, Object obj);

    void onInserted(int i2, int i3);

    void onMoved(int i2, int i3);

    void onRemoved(int i2, int i3);
}
