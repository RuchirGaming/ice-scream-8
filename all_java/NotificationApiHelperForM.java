package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class NotificationApiHelperForM {
    static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }

    private NotificationApiHelperForM() {
    }
}
