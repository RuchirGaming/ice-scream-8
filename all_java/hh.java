package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class hh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f31308e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f31309a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f31310b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31311c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31312d = 4096;

    final class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i2) {
        for (int i3 = 0; i3 < this.f31310b.size(); i3++) {
            byte[] bArr = (byte[]) this.f31310b.get(i3);
            if (bArr.length >= i2) {
                this.f31311c -= bArr.length;
                this.f31310b.remove(i3);
                this.f31309a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f31312d) {
                this.f31309a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f31310b, bArr, f31308e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f31310b.add(iBinarySearch, bArr);
                this.f31311c += bArr.length;
                synchronized (this) {
                    while (this.f31311c > this.f31312d) {
                        byte[] bArr2 = (byte[]) this.f31309a.remove(0);
                        this.f31310b.remove(bArr2);
                        this.f31311c -= bArr2.length;
                    }
                }
            }
        }
    }
}
