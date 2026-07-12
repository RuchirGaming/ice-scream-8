package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
abstract class zzhk {
    zzhk() {
    }

    abstract int zza(int i2, byte[] bArr, int i3, int i4);

    final boolean zzb(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }
}
