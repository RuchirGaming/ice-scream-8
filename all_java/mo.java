package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class mo implements Comparator<Z2> {
    @Override // java.util.Comparator
    public int compare(Z2 z2, Z2 z3) {
        Z2 z4 = z2;
        Z2 z5 = z3;
        return (TextUtils.equals(z4.f26386a, z5.f26386a) && TextUtils.equals(z4.f26387b, z5.f26387b)) ? 0 : 10;
    }
}
