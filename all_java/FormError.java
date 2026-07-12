package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public class FormError {
    private final int zza;
    private final String zzb;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i2, String str) {
        this.zza = i2;
        this.zzb = str;
    }

    public int getErrorCode() {
        return this.zza;
    }

    public String getMessage() {
        return this.zzb;
    }
}
