package com.google.firebase.installations;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public abstract class InstallationTokenResult {

    public static abstract class Builder {
        public abstract InstallationTokenResult build();

        public abstract Builder setToken(String str);

        public abstract Builder setTokenCreationTimestamp(long j2);

        public abstract Builder setTokenExpirationTimestamp(long j2);
    }

    public abstract String getToken();

    public abstract long getTokenCreationTimestamp();

    public abstract long getTokenExpirationTimestamp();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }
}
