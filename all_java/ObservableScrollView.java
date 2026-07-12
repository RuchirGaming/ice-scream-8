package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class ObservableScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f22345a;

    public ObservableScrollView(Context context) {
        super(context);
        this.f22345a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f22345a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22345a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i2) {
        super.fling(i2 / 4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        a aVar = this.f22345a;
        if (aVar != null) {
            aVar.a(this, i2, i3, i4, i5);
        }
    }
}
