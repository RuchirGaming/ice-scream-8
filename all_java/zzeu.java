package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzeu extends IllegalArgumentException {
    zzeu(int i2, int i3) {
        super("Unpaired surrogate at index " + i2 + " of " + i3);
    }
}
