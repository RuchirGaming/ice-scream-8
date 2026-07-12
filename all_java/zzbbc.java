package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public enum zzbbc implements zzgwo {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    private static final zzgwp zzg = new zzgwp() { // from class: com.google.android.gms.internal.ads.zzbba
    };
    private final int zzi;

    zzbbc(int i2) {
        this.zzi = i2;
    }

    public static zzbbc zzb(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return CONNECTING;
        }
        if (i2 == 2) {
            return CONNECTED;
        }
        if (i2 == 3) {
            return DISCONNECTING;
        }
        if (i2 == 4) {
            return DISCONNECTED;
        }
        if (i2 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
