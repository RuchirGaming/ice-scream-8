package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public final class G8 implements Comparable<G8> {
    public final int A00;
    public final G4 A01;

    public G8(int i2, G4 g4) {
        this.A00 = i2;
        this.A01 = g4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(G8 g8) {
        return this.A00 - g8.A00;
    }
}
