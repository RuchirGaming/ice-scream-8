package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.TelemetryConfig;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzhdi {
    public static final zzhdi zza = new zzhdi(1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    public static final zzhdi zzb = new zzhdi(TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, -1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    public static final zzhdi zzc = new zzhdi(-1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, -1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    public static final zzhdi zzd = new zzhdi(TelemetryConfig.DEFAULT_SAMPLING_FACTOR, -1.0d, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, 1.0d, TelemetryConfig.DEFAULT_SAMPLING_FACTOR, TelemetryConfig.DEFAULT_SAMPLING_FACTOR);
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    public zzhdi(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.zze = d6;
        this.zzf = d7;
        this.zzg = d8;
        this.zzh = d2;
        this.zzi = d3;
        this.zzj = d4;
        this.zzk = d5;
        this.zzl = d9;
        this.zzm = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhdi zzhdiVar = (zzhdi) obj;
        return Double.compare(zzhdiVar.zzh, this.zzh) == 0 && Double.compare(zzhdiVar.zzi, this.zzi) == 0 && Double.compare(zzhdiVar.zzj, this.zzj) == 0 && Double.compare(zzhdiVar.zzk, this.zzk) == 0 && Double.compare(zzhdiVar.zzl, this.zzl) == 0 && Double.compare(zzhdiVar.zzm, this.zzm) == 0 && Double.compare(zzhdiVar.zze, this.zze) == 0 && Double.compare(zzhdiVar.zzf, this.zzf) == 0 && Double.compare(zzhdiVar.zzg, this.zzg) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zze);
        long j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zzf);
        long j3 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.zzg);
        long j4 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.zzh);
        long j5 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.zzi);
        long j6 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.zzj);
        long j7 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.zzk);
        long j8 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.zzl);
        long j9 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.zzm);
        return (((((((((((((((((int) j2) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zza)) {
            return "Rotate 0°";
        }
        if (equals(zzb)) {
            return "Rotate 90°";
        }
        if (equals(zzc)) {
            return "Rotate 180°";
        }
        if (equals(zzd)) {
            return "Rotate 270°";
        }
        double d2 = this.zze;
        double d3 = this.zzf;
        double d4 = this.zzg;
        double d5 = this.zzh;
        double d6 = this.zzi;
        double d7 = this.zzj;
        double d8 = this.zzk;
        double d9 = this.zzl;
        double d10 = this.zzm;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
