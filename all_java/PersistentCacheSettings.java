package com.google.firebase.firestore;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class PersistentCacheSettings implements LocalCacheSettings {
    private final long sizeBytes;

    public static Builder newBuilder() {
        return new Builder();
    }

    private PersistentCacheSettings(long j2) {
        this.sizeBytes = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.sizeBytes == ((PersistentCacheSettings) obj).sizeBytes;
    }

    public int hashCode() {
        long j2 = this.sizeBytes;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.sizeBytes + AbstractJsonLexerKt.END_OBJ;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public static class Builder {
        private long sizeBytes;

        private Builder() {
            this.sizeBytes = 104857600L;
        }

        public Builder setSizeBytes(long j2) {
            this.sizeBytes = j2;
            return this;
        }

        public PersistentCacheSettings build() {
            return new PersistentCacheSettings(this.sizeBytes);
        }
    }
}
