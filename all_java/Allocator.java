package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface Allocator {
    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(Allocation[] allocationArr);

    void trim();
}
