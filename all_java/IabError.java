package com.explorestack.iab;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class IabError {
    public static final int ERROR_CODE_BAD_CONTENT = 3;
    public static final int ERROR_CODE_EXPIRED = 6;
    public static final int ERROR_CODE_INCORRECT_STATE = 4;
    public static final int ERROR_CODE_INTERNAL = 0;
    public static final int ERROR_CODE_NO_FILL = 7;
    public static final int ERROR_CODE_NO_NETWORK = 1;
    public static final int ERROR_CODE_NO_REQUIRED_ARGUMENTS = 2;
    public static final int ERROR_CODE_PLACEHOLDER_TIMEOUT = 5;
    public static final IabError NO_NETWORK = new IabError(1, InitializeAndroidBoldSDK.MSG_NO_INTERNET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8343b;

    public IabError(int i2, String str) {
        this.f8342a = i2;
        this.f8343b = str;
    }

    public static IabError badContent(String str) {
        return new IabError(3, str);
    }

    public static IabError expired(String str) {
        return new IabError(6, str);
    }

    public static IabError incorrectState(String str) {
        return new IabError(4, str);
    }

    public static IabError internal(String str) {
        return new IabError(0, str);
    }

    public static IabError noFIll(String str) {
        return new IabError(7, str);
    }

    public static IabError noRequiredArguments(String str) {
        return new IabError(2, str);
    }

    public static IabError placeholder(String str) {
        return new IabError(5, str);
    }

    public static IabError throwable(String str, Throwable th) {
        if (th != null) {
            try {
                StringBuilder sb = new StringBuilder(str);
                sb.append(" - ");
                sb.append(th.getClass().getName());
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb.append(": ");
                    sb.append(message);
                }
                return internal(sb.toString());
            } catch (Throwable unused) {
            }
        }
        return internal(str);
    }

    public int getCode() {
        return this.f8342a;
    }

    public String getMessage() {
        return this.f8343b;
    }

    public String toString() {
        return String.format("(%s) %s", Integer.valueOf(this.f8342a), this.f8343b);
    }
}
