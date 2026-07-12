package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzlz extends IllegalArgumentException {
    zzlz(int i2, int i3) {
        super("Unpaired surrogate at index " + i2 + " of " + i3);
    }
}
