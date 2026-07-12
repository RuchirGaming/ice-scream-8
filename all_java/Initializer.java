package androidx.startup;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface Initializer<T> {
    T create(Context context);

    List<Class<? extends Initializer<?>>> dependencies();
}
