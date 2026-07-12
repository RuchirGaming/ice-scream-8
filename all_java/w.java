package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class w {
    public static final w uT = new w(0, 0);
    public final long rJ;
    public final long uc;

    public w(long j2, long j3) {
        this.rJ = j2;
        this.uc = j3;
    }

    public String toString() {
        return "[timeUs=" + this.rJ + ", position=" + this.uc + com.ironsource.sdk.constants.a.i.f17749e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.rJ == wVar.rJ && this.uc == wVar.uc;
    }

    public int hashCode() {
        return (((int) this.rJ) * 31) + ((int) this.uc);
    }
}
