package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public interface fx extends np {
    long a();

    void a(int i2) throws IOException;

    void a(byte[] bArr, int i2, int i3) throws IOException;

    boolean a(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    long b();

    void b(int i2) throws IOException;

    boolean b(byte[] bArr, int i2, int i3, boolean z) throws IOException;

    void d();

    long getPosition();

    @Override // com.yandex.mobile.ads.impl.np
    int read(byte[] bArr, int i2, int i3) throws IOException;

    void readFully(byte[] bArr, int i2, int i3) throws IOException;
}
