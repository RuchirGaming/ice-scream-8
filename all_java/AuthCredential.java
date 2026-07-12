package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.0.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public abstract class AuthCredential extends AbstractSafeParcelable {
    AuthCredential() {
    }

    public abstract String getProvider();

    public abstract String getSignInMethod();

    public abstract AuthCredential zza();
}
