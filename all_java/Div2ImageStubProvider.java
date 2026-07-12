package com.yandex.div.core;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface Div2ImageStubProvider {
    public static final Div2ImageStubProvider STUB = new Div2ImageStubProvider() { // from class: com.yandex.div.core.Div2ImageStubProvider$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.Div2ImageStubProvider
        public final Drawable getImageStubDrawable(int i2) {
            return new ColorDrawable(i2);
        }
    };

    Drawable getImageStubDrawable(int i2);
}
