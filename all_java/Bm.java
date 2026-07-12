package com.yandex.metrica.impl.ob;

import java.util.Random;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f24597a;

    public Bm() {
        this(new Random());
    }

    public long a(long j2, long j3) {
        if (j2 >= j3) {
            throw new IllegalArgumentException("min should be less than max");
        }
        long jNextLong = this.f24597a.nextLong();
        if (jNextLong == Long.MIN_VALUE) {
            jNextLong = 0;
        } else if (jNextLong < 0) {
            jNextLong = -jNextLong;
        }
        return j2 + (jNextLong % (j3 - j2));
    }

    public Bm(Random random) {
        this.f24597a = random;
    }
}
