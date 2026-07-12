package com.ktplay.open;

import com.ktplay.b.a;
import com.yandex.div.core.dagger.Names;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class KTError {
    public int code;
    public Object context;
    public String description;
    public String failureReason;
    public String recoverySuggestion;

    public KTError() {
    }

    public KTError(int i2, String str, String str2, String str3, Object obj) {
        this.code = i2;
        this.description = str;
        this.failureReason = str2;
        this.recoverySuggestion = str3;
        this.context = obj;
    }

    public KTError(String str, String str2, String str3) {
        this(0, str, str2, str3, null);
    }

    public KTError(int i2, String str) {
        this(i2, str, null, null, null);
    }

    public static KTError createFromObject(Object obj) {
        if (obj == null) {
            return null;
        }
        KTError kTError = new KTError();
        kTError.code = ((Integer) a.a(obj, "code")).intValue();
        kTError.description = (String) a.a(obj, IabUtils.KEY_DESCRIPTION);
        kTError.failureReason = (String) a.a(obj, "failureReason");
        kTError.recoverySuggestion = (String) a.a(obj, "recoverySuggestion");
        kTError.context = a.a(obj, Names.CONTEXT);
        return kTError;
    }
}
