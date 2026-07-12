package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public interface ImageData {
    Drawable getImage();

    Uri getLocalUri();

    String getRemoteUrl();
}
