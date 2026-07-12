package com.google.firebase.encoders;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes4.dex */
public interface DataEncoder {
    String encode(Object obj);

    void encode(Object obj, Writer writer) throws IOException;
}
