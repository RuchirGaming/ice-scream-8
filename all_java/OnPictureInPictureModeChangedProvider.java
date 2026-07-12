package androidx.core.app;

import androidx.core.util.Consumer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface OnPictureInPictureModeChangedProvider {
    void addOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer);

    void removeOnPictureInPictureModeChangedListener(Consumer<PictureInPictureModeChangedInfo> consumer);
}
