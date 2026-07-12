package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
class zzahs {
    public final int zzd;

    public zzahs(int i2) {
        this.zzd = i2;
    }

    public static int zze(int i2) {
        return (i2 >> 24) & 255;
    }

    public static String zzf(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
