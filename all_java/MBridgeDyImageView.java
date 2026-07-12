package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.aa;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeDyImageView extends ImageView {
    public MBridgeDyImageView(Context context) {
        super(context);
    }

    public MBridgeDyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeDyImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            aa.d("MBridgeDyImageView", th.getMessage());
        }
    }
}
