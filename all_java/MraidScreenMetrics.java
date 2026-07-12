package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.explorestack.iab.utils.Utils;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class MraidScreenMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f8408a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f8409b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8410c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f8411d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f8412e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f8413f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f8414g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f8415h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f8416i;

    public MraidScreenMetrics(Context context) {
        this.f8416i = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(Rect rect, Rect rect2, int i2, int i3, int i4, int i5) {
        if (rect.left == i2 && rect.top == i3 && i2 + i4 == rect.right && i3 + i5 == rect.bottom) {
            return false;
        }
        rect.set(i2, i3, i4 + i2, i5 + i3);
        a(rect, rect2);
        return true;
    }

    Rect a() {
        return this.f8413f;
    }

    void a(Rect rect, Rect rect2) {
        rect2.set(Utils.pixelsToIntDips(rect.left, this.f8416i), Utils.pixelsToIntDips(rect.top, this.f8416i), Utils.pixelsToIntDips(rect.right, this.f8416i), Utils.pixelsToIntDips(rect.bottom, this.f8416i));
    }

    boolean a(int i2, int i3) {
        if (this.f8408a.width() == i2 && this.f8408a.height() == i3) {
            return false;
        }
        this.f8408a.set(0, 0, i2, i3);
        a(this.f8408a, this.f8409b);
        return true;
    }

    boolean a(int i2, int i3, int i4, int i5) {
        return a(this.f8412e, this.f8413f, i2, i3, i4, i5);
    }

    Rect b() {
        return this.f8414g;
    }

    boolean b(int i2, int i3, int i4, int i5) {
        return a(this.f8414g, this.f8415h, i2, i3, i4, i5);
    }

    Rect c() {
        return this.f8415h;
    }

    boolean c(int i2, int i3, int i4, int i5) {
        return a(this.f8410c, this.f8411d, i2, i3, i4, i5);
    }

    Rect d() {
        return this.f8411d;
    }

    Rect e() {
        return this.f8409b;
    }

    public float getDensity() {
        return this.f8416i;
    }
}
