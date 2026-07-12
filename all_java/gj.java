package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class gj implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f31046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f31050e;

    public gj(Context context, View.OnClickListener onClickListener) {
        this.f31046a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f31047b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f31046a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i2 = action & 255;
        if (i2 == 0) {
            this.f31049d = x;
            this.f31050e = y;
            this.f31048c = true;
        } else {
            if (i2 == 1) {
                if (!this.f31048c) {
                    return true;
                }
                this.f31046a.onClick(view);
                return true;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    this.f31048c = false;
                }
            } else if (this.f31048c) {
                int i3 = (int) (x - this.f31049d);
                int i4 = (int) (y - this.f31050e);
                if ((i4 * i4) + (i3 * i3) > this.f31047b) {
                    this.f31048c = false;
                }
            }
        }
        return false;
    }
}
