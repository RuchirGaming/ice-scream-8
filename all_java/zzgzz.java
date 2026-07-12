package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzgzz implements zzgwq {
    static final zzgwq zza = new zzgzz();

    private zzgzz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwq
    public final boolean zza(int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 1999) {
            switch (i2) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
