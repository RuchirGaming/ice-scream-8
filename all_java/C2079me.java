package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class C2079me implements InterfaceC1855de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f27623a;

    public C2079me(List<C1980ie> list) {
        if (list == null) {
            this.f27623a = new HashSet();
            return;
        }
        this.f27623a = new HashSet(list.size());
        for (C1980ie c1980ie : list) {
            if (c1980ie.f27119b) {
                this.f27623a.add(c1980ie.f27118a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1855de
    public boolean a(String str) {
        return this.f27623a.contains(str);
    }

    public String toString() {
        return "StartupBasedPermissionStrategy{mEnabledPermissions=" + this.f27623a + AbstractJsonLexerKt.END_OBJ;
    }
}
