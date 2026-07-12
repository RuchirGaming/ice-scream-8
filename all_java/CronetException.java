package org.chromium.net;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public abstract class CronetException extends IOException {
    protected CronetException(String str, Throwable th) {
        super(str, th);
    }
}
