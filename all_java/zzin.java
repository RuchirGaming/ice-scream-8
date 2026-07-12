package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
abstract class zzin implements zzio {
    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(zza());
    }

    zzin() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
