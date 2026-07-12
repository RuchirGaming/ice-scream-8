package com.google.firebase.tracing;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public final class FirebaseTrace {
    private FirebaseTrace() {
    }

    public static void pushTrace(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void popTrace() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
