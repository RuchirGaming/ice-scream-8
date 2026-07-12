package com.mbridge.msdk.thrid.okhttp.internal.tls;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface TrustRootIndex {
    X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate);
}
