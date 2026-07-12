package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface TintableCompoundDrawablesView {
    ColorStateList getSupportCompoundDrawablesTintList();

    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode);
}
