package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public final class zzyz extends IOException {
    public zzyz(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
