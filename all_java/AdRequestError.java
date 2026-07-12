package com.yandex.mobile.ads.common;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f28854c;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public AdRequestError(int i2, String str) {
        this(i2, str, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequestError.class != obj.getClass()) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f28853b == adRequestError.f28853b && Objects.equals(this.f28854c, adRequestError.f28854c)) {
            return this.f28852a.equals(adRequestError.f28852a);
        }
        return false;
    }

    public String getAdUnitId() {
        return this.f28854c;
    }

    public int getCode() {
        return this.f28853b;
    }

    public String getDescription() {
        return this.f28852a;
    }

    public int hashCode() {
        int iHashCode = ((this.f28852a.hashCode() * 31) + this.f28853b) * 31;
        String str = this.f28854c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return String.format(Locale.US, "AdRequestError (code: %d, description: %s, adUnitId: %s)", Integer.valueOf(this.f28853b), this.f28852a, this.f28854c);
    }

    public AdRequestError(int i2, String str, String str2) {
        this.f28853b = i2;
        this.f28852a = str == null ? "Unknown reason" : str;
        this.f28854c = str2;
    }
}
