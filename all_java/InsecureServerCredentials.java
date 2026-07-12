package io.grpc;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public final class InsecureServerCredentials extends ServerCredentials {
    public static ServerCredentials create() {
        return new InsecureServerCredentials();
    }

    private InsecureServerCredentials() {
    }
}
