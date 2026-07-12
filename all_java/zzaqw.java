package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
final class zzaqw implements Runnable {
    private zzaqw() {
    }

    /* synthetic */ zzaqw(zzaqv zzaqvVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaqx.zzd = MessageDigest.getInstance(SameMD5.TAG);
            countDownLatch = zzaqx.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaqx.zzb;
        } catch (Throwable th) {
            zzaqx.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
