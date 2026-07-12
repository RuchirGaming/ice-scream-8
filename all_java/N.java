package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class N extends AbstractC2142p2<Boolean> {
    public N(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2142p2
    protected Boolean a(int i2) {
        return Boolean.valueOf(this.f27758a.getResources().getBoolean(i2));
    }
}
