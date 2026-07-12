package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzgdb {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgda zza(String str) throws GeneralSecurityException {
        for (zzgda zzgdaVar : zza) {
            if (zzgdaVar.zza()) {
                return zzgdaVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
