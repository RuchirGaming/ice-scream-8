package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
abstract class zznh {
    zznh() {
    }

    abstract int zza(int i2, byte[] bArr, int i3, int i4);

    abstract int zza(String str, byte[] bArr, int i2, int i3);

    abstract String zza(byte[] bArr, int i2, int i3) throws zzkd;

    final boolean zzb(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }
}
