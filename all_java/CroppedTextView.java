package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class CroppedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23679a;

    public CroppedTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = getMeasuredHeight();
        int lineHeight = getLineHeight();
        int minLines = getMinLines();
        int maxLines = getMaxLines();
        if (lineHeight > 0) {
            int iMin = Math.min((Math.round(getLineHeight() * 0.05f) + measuredHeight) / lineHeight, this.f23679a);
            if (iMin == minLines && iMin == maxLines) {
                return;
            }
            setLines(iMin);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CroppedTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f23679a = getMaxLines();
    }
}
