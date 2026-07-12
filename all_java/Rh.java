package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Rh implements InterfaceC1909fi {
    Rh() {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1909fi
    public ServerSocket a(int i2) throws IOException {
        return new ServerSocket(i2);
    }
}
