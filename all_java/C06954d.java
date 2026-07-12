package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/audience_network.dex */
public class C06954d extends ViewGroup.MarginLayoutParams {
    public AbstractC07114u A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C06954d(int i2, int i3) {
        super(i2, i3);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06954d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06954d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06954d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C06954d(C06954d c06954d) {
        super((ViewGroup.LayoutParams) c06954d);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0I();
    }

    public final boolean A01() {
        return this.A00.A0f();
    }

    public final boolean A02() {
        return this.A00.A0c();
    }

    public final boolean A03() {
        return this.A00.A0b();
    }
}
