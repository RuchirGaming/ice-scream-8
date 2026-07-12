package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public interface AJ {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A4N(int i2, int i3, int i4) throws AI;

    ByteBuffer A7O();

    int A7P();

    int A7Q();

    int A7R();

    boolean A8l();

    boolean A8q();

    void AE6();

    void AE7(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
