package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = Float.MIN_VALUE;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final int positionAnchor;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int windowColor;
    public final boolean windowColorSet;

    public @interface AnchorType {
    }

    public @interface LineType {
    }

    public @interface TextSizeType {
    }

    public Cue(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i3, f2, i2, Integer.MIN_VALUE, Float.MIN_VALUE, f4, f5, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, i5, f5, f4, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, Float.MIN_VALUE, f4, Float.MIN_VALUE, z, i5);
    }

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.text = charSequence;
        this.textAlignment = alignment;
        this.bitmap = bitmap;
        this.line = f2;
        this.lineType = i2;
        this.lineAnchor = i3;
        this.position = f3;
        this.positionAnchor = i4;
        this.size = f5;
        this.bitmapHeight = f6;
        this.windowColorSet = z;
        this.windowColor = i6;
        this.textSizeType = i5;
        this.textSize = f4;
    }
}
