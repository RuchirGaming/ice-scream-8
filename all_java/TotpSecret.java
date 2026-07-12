package com.google.firebase.auth;

import android.app.Activity;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface TotpSecret {
    String generateQrCodeUrl();

    String generateQrCodeUrl(String str, String str2);

    int getCodeIntervalSeconds();

    int getCodeLength();

    long getEnrollmentCompletionDeadline();

    String getHashAlgorithm();

    String getSessionInfo();

    String getSharedSecretKey();

    void openInOtpApp(String str);

    void openInOtpApp(String str, String str2, Activity activity);
}
