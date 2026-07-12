package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface ContentMetadata {
    public static final String INTERNAL_METADATA_NAME_PREFIX = "exo_";

    boolean contains(String str);

    long get(String str, long j2);

    String get(String str, String str2);

    byte[] get(String str, byte[] bArr);
}
