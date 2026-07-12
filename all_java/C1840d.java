package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C1840d extends IOException {
    public C1840d(String str) {
        super(str);
    }

    static C1840d a() {
        return new C1840d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1840d b() {
        return new C1840d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
