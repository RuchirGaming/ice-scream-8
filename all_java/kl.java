package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class kl implements ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie0.a f32257a = new ie0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie0[] f32258b;

    public kl(ie0... ie0VarArr) {
        this.f32258b = ie0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.ie0
    public final ie0.a a(int i2, int i3) {
        ie0[] ie0VarArr = this.f32258b;
        int length = ie0VarArr.length;
        int i4 = 0;
        while (i4 < length) {
            ie0.a aVarA = ie0VarArr[i4].a(i2, i3);
            int i5 = aVarA.f31586a;
            i4++;
            i3 = aVarA.f31587b;
            i2 = i5;
        }
        ie0.a aVar = this.f32257a;
        aVar.f31586a = i2;
        aVar.f31587b = i3;
        return aVar;
    }
}
