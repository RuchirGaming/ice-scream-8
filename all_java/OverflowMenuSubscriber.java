package com.yandex.div.internal.widget.menu;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface OverflowMenuSubscriber {

    public interface Listener {
        void dismiss();
    }

    void subscribe(Listener listener);
}
