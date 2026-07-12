package com.monetization.ads.mediation.base;

import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class MediatedAdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23707b;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public MediatedAdRequestError(int i2, String str) {
        this.f23707b = i2;
        this.f23706a = str == null ? "Unknown reason" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediatedAdRequestError.class != obj.getClass()) {
            return false;
        }
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        if (this.f23707b != mediatedAdRequestError.f23707b) {
            return false;
        }
        return this.f23706a.equals(mediatedAdRequestError.f23706a);
    }

    public int getCode() {
        return this.f23707b;
    }

    public String getDescription() {
        return this.f23706a;
    }

    public int hashCode() {
        return (this.f23706a.hashCode() * 31) + this.f23707b;
    }

    public String toString() {
        return String.format(Locale.US, "AdRequestError (code: %d, description: %s)", Integer.valueOf(this.f23707b), this.f23706a);
    }
}
