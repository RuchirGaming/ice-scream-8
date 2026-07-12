package com.yandex.div.core.font;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        public Typeface getRegularLegacy() {
            return null;
        }
    };

    Typeface getBold();

    Typeface getLight();

    Typeface getMedium();

    Typeface getRegular();

    @Deprecated
    Typeface getRegularLegacy();

    /* JADX INFO: renamed from: com.yandex.div.core.font.DivTypefaceProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
