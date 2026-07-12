package androidx.media;

import android.os.Bundle;
import androidx.versionedparcelable.VersionedParcelable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
interface AudioAttributesImpl extends VersionedParcelable {
    Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();

    Bundle toBundle();
}
