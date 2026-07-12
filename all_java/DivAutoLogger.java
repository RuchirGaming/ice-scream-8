package com.yandex.div.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
@Deprecated
public interface DivAutoLogger {
    public static final DivAutoLogger DEFAULT = new DivAutoLogger() { // from class: com.yandex.div.core.DivAutoLogger.1
        @Override // com.yandex.div.core.DivAutoLogger
        public void logPopupMenuItemClick(View view, int i2, String str) {
        }

        @Override // com.yandex.div.core.DivAutoLogger
        public /* synthetic */ void logPopupMenuItemClick(View view, int i2, String str, Uri uri) {
            logPopupMenuItemClick(view, i2, str);
        }

        @Override // com.yandex.div.core.DivAutoLogger
        public void setId(View view, String str) {
        }
    };

    void logPopupMenuItemClick(View view, int i2, String str);

    void logPopupMenuItemClick(View view, int i2, String str, Uri uri);

    void setId(View view, String str);

    /* JADX INFO: renamed from: com.yandex.div.core.DivAutoLogger$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$logPopupMenuItemClick(DivAutoLogger _this, View view, int i2, String str) {
        }

        public static void $default$setId(DivAutoLogger _this, View view, String str) {
        }
    }
}
