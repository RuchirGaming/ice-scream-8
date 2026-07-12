package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzawt {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e2) {
            zzcbn.zzh("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e3) {
                zzcbn.zzh("HashManager: Unable to convert to Base64.", e3);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
