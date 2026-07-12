package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public interface InterfaceC1909fi {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fi$a */
    public static class a extends Throwable {
        a(String str, Throwable th) {
            super(str, th);
        }
    }

    ServerSocket a(int i2) throws IOException, a;
}
