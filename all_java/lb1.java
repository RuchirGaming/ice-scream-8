package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class lb1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<a> f32547h = new Comparator() { // from class: com.yandex.mobile.ads.impl.lb1$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lb1.a((lb1.a) obj, (lb1.a) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<a> f32548i = new Comparator() { // from class: com.yandex.mobile.ads.impl.lb1$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lb1.b((lb1.a) obj, (lb1.a) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32549a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32555g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a[] f32551c = new a[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f32550b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32552d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f32558c;

        private a() {
        }

        /* synthetic */ a(int i2) {
            this();
        }
    }

    public lb1(int i2) {
        this.f32549a = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f32556a - aVar2.f32556a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.f32558c, aVar2.f32558c);
    }

    public final void a(int i2, float f2) {
        a aVar;
        if (this.f32552d != 1) {
            Collections.sort(this.f32550b, f32547h);
            this.f32552d = 1;
        }
        int i3 = this.f32555g;
        int i4 = 0;
        if (i3 > 0) {
            a[] aVarArr = this.f32551c;
            int i5 = i3 - 1;
            this.f32555g = i5;
            aVar = aVarArr[i5];
        } else {
            aVar = new a(i4);
        }
        int i6 = this.f32553e;
        this.f32553e = i6 + 1;
        aVar.f32556a = i6;
        aVar.f32557b = i2;
        aVar.f32558c = f2;
        this.f32550b.add(aVar);
        this.f32554f += i2;
        while (true) {
            int i7 = this.f32554f;
            int i8 = this.f32549a;
            if (i7 <= i8) {
                return;
            }
            int i9 = i7 - i8;
            a aVar2 = this.f32550b.get(0);
            int i10 = aVar2.f32557b;
            if (i10 <= i9) {
                this.f32554f -= i10;
                this.f32550b.remove(0);
                int i11 = this.f32555g;
                if (i11 < 5) {
                    a[] aVarArr2 = this.f32551c;
                    this.f32555g = i11 + 1;
                    aVarArr2[i11] = aVar2;
                }
            } else {
                aVar2.f32557b = i10 - i9;
                this.f32554f -= i9;
            }
        }
    }

    public final void b() {
        this.f32550b.clear();
        this.f32552d = -1;
        this.f32553e = 0;
        this.f32554f = 0;
    }

    public final float a() {
        if (this.f32552d != 0) {
            Collections.sort(this.f32550b, f32548i);
            this.f32552d = 0;
        }
        float f2 = 0.5f * this.f32554f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32550b.size(); i3++) {
            a aVar = this.f32550b.get(i3);
            i2 += aVar.f32557b;
            if (i2 >= f2) {
                return aVar.f32558c;
            }
        }
        if (this.f32550b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<a> arrayList = this.f32550b;
        return arrayList.get(arrayList.size() - 1).f32558c;
    }
}
