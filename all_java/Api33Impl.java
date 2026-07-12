package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
class Api33Impl {
    private Api33Impl() {
    }

    static <T> T getParcelable(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
