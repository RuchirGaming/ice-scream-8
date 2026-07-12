package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Vh implements InterfaceC1909fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f26108a;

    Vh(File file) {
        this.f26108a = file;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1909fi
    public ServerSocket a(int i2) throws IOException, InterfaceC1909fi.a {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.f26108a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i2);
        } catch (Exception e2) {
            throw new InterfaceC1909fi.a("https_open_error", e2);
        }
    }
}
