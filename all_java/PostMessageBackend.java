package androidx.browser.customtabs;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface PostMessageBackend {
    void onDisconnectChannel(Context context);

    boolean onNotifyMessageChannelReady(Bundle bundle);

    boolean onPostMessage(String str, Bundle bundle);
}
