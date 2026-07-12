package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzqg {
    public static void zza(AudioTrack audioTrack, zzqi zzqiVar) {
        audioTrack.setPreferredDevice(zzqiVar == null ? null : zzqiVar.zza);
    }
}
