package androidx.core.content;

import android.content.res.Configuration;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface OnConfigurationChangedProvider {
    void addOnConfigurationChangedListener(Consumer<Configuration> consumer);

    void removeOnConfigurationChangedListener(Consumer<Configuration> consumer);
}
