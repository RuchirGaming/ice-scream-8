package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class WebvttCue extends Cue {
    public final long endTime;
    public final long startTime;

    public WebvttCue(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public WebvttCue(long j2, long j3, CharSequence charSequence) {
        this(j2, j3, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WebvttCue(long j2, long j3, CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4);
        this.startTime = j2;
        this.endTime = j3;
    }

    public final boolean isNormalCue() {
        return this.line == Float.MIN_VALUE && this.position == Float.MIN_VALUE;
    }

    public static class Builder {
        private static final String TAG = "WebvttCueBuilder";
        private long endTime;
        private float line;
        private int lineAnchor;
        private int lineType;
        private float position;
        private int positionAnchor;
        private long startTime;
        private SpannableStringBuilder text;
        private Layout.Alignment textAlignment;
        private float width;

        public Builder() {
            reset();
        }

        public void reset() {
            this.startTime = 0L;
            this.endTime = 0L;
            this.text = null;
            this.textAlignment = null;
            this.line = Float.MIN_VALUE;
            this.lineType = Integer.MIN_VALUE;
            this.lineAnchor = Integer.MIN_VALUE;
            this.position = Float.MIN_VALUE;
            this.positionAnchor = Integer.MIN_VALUE;
            this.width = Float.MIN_VALUE;
        }

        public WebvttCue build() {
            if (this.position != Float.MIN_VALUE && this.positionAnchor == Integer.MIN_VALUE) {
                derivePositionAnchorFromAlignment();
            }
            return new WebvttCue(this.startTime, this.endTime, this.text, this.textAlignment, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.width);
        }

        public Builder setStartTime(long j2) {
            this.startTime = j2;
            return this;
        }

        public Builder setEndTime(long j2) {
            this.endTime = j2;
            return this;
        }

        public Builder setText(SpannableStringBuilder spannableStringBuilder) {
            this.text = spannableStringBuilder;
            return this;
        }

        public Builder setTextAlignment(Layout.Alignment alignment) {
            this.textAlignment = alignment;
            return this;
        }

        public Builder setLine(float f2) {
            this.line = f2;
            return this;
        }

        public Builder setLineType(int i2) {
            this.lineType = i2;
            return this;
        }

        public Builder setLineAnchor(int i2) {
            this.lineAnchor = i2;
            return this;
        }

        public Builder setPosition(float f2) {
            this.position = f2;
            return this;
        }

        public Builder setPositionAnchor(int i2) {
            this.positionAnchor = i2;
            return this;
        }

        public Builder setWidth(float f2) {
            this.width = f2;
            return this;
        }

        private Builder derivePositionAnchorFromAlignment() {
            if (this.textAlignment == null) {
                this.positionAnchor = Integer.MIN_VALUE;
            } else {
                int i2 = AnonymousClass1.$SwitchMap$android$text$Layout$Alignment[this.textAlignment.ordinal()];
                if (i2 == 1) {
                    this.positionAnchor = 0;
                } else if (i2 == 2) {
                    this.positionAnchor = 1;
                } else if (i2 == 3) {
                    this.positionAnchor = 2;
                } else {
                    Log.w(TAG, "Unrecognized alignment: " + this.textAlignment);
                    this.positionAnchor = 0;
                }
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttCue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
