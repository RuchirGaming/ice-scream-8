package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.4.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
final class zzgc {
    static void zza(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j2 + ", " + j3 + ")");
    }

    static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
