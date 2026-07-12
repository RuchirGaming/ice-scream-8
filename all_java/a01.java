package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class a01 implements ie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie0.a f28870a = new ie0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mb f28871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f28872c;

    public a01(float f2) {
        this.f28872c = f2;
        this.f28871b = new mb(f2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    @Override // com.yandex.mobile.ads.impl.ie0
    public final ie0.a a(int i2, int i3) {
        int iB;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                int iA = this.f28871b.a(size);
                if (mode2 == Integer.MIN_VALUE) {
                    iA = Math.min(size2, iA);
                }
                i3 = View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
            } else if (mode2 != 1073741824) {
                if (mode != Integer.MIN_VALUE || mode == 0) {
                    iB = this.f28871b.b(size2);
                    if (mode == Integer.MIN_VALUE) {
                        iB = Math.min(size, iB);
                    }
                    i2 = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
                } else if (mode2 == Integer.MIN_VALUE) {
                    if (size / size2 > this.f28872c) {
                        i2 = View.MeasureSpec.makeMeasureSpec(this.f28871b.b(size2), 1073741824);
                        i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                    } else {
                        int iA2 = this.f28871b.a(size);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        i3 = View.MeasureSpec.makeMeasureSpec(iA2, 1073741824);
                        i2 = iMakeMeasureSpec;
                    }
                }
            } else if (mode2 == Integer.MIN_VALUE) {
                if (size / size2 > this.f28872c) {
                    i2 = View.MeasureSpec.makeMeasureSpec(this.f28871b.b(size2), 1073741824);
                    i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else {
                    int iA3 = this.f28871b.a(size);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i3 = View.MeasureSpec.makeMeasureSpec(iA3, 1073741824);
                    i2 = iMakeMeasureSpec2;
                }
            }
        } else if (mode2 != 1073741824) {
            if (mode != Integer.MIN_VALUE || mode == 0) {
                iB = this.f28871b.b(size2);
                if (mode == Integer.MIN_VALUE) {
                    iB = Math.min(size, iB);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
            } else if (mode2 == Integer.MIN_VALUE) {
                if (size / size2 > this.f28872c) {
                    i2 = View.MeasureSpec.makeMeasureSpec(this.f28871b.b(size2), 1073741824);
                    i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else {
                    int iA4 = this.f28871b.a(size);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i3 = View.MeasureSpec.makeMeasureSpec(iA4, 1073741824);
                    i2 = iMakeMeasureSpec3;
                }
            }
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f28872c) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f28871b.b(size2), 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iA5 = this.f28871b.a(size);
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(iA5, 1073741824);
                i2 = iMakeMeasureSpec4;
            }
        }
        ie0.a aVar = this.f28870a;
        aVar.f31586a = i2;
        aVar.f31587b = i3;
        return aVar;
    }
}
