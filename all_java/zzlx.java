package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
abstract class zzlx {
    zzlx() {
    }

    abstract int zza(int i2, byte[] bArr, int i3, int i4);

    final boolean zzb(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }
}
