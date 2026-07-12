package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class zzxv {
    private final byte[] zza;

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final int zza() {
        return this.zza.length;
    }

    public static zzxv zza(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        int length = bArr.length;
        Objects.requireNonNull(bArr, "data must be non-null");
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxv(bArr, 0, length);
    }

    public final String toString() {
        return "Bytes(" + zzxl.zza(this.zza) + ")";
    }

    private zzxv(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxv) {
            return Arrays.equals(((zzxv) obj).zza, this.zza);
        }
        return false;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
