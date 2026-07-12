package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
abstract class zzamo {
    zzamo() {
    }

    abstract int zza(int i2, byte[] bArr, int i3, int i4);

    abstract int zza(String str, byte[] bArr, int i2, int i3);

    abstract String zza(byte[] bArr, int i2, int i3) throws zzajk;

    final boolean zzb(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }
}
