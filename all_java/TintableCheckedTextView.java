package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface TintableCheckedTextView {
    ColorStateList getSupportCheckMarkTintList();

    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(PorterDuff.Mode mode);
}
