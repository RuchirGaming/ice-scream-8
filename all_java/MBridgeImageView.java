package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.aa;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f19201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f19211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f19212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f19213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f19214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f19217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f19218r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f19217q = new Path();
        this.f19218r = new Paint();
        this.f19211k = new float[8];
        this.f19212l = new float[8];
        this.f19214n = new RectF();
        this.f19213m = new RectF();
        this.f19201a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        super.onSizeChanged(i2, i3, i4, i5);
        this.f19202b = i2;
        this.f19203c = i3;
        int i9 = 0;
        if (this.f19216p) {
            try {
                if (this.f19211k != null && this.f19212l != null) {
                    while (true) {
                        i6 = 2;
                        if (i9 >= 2) {
                            break;
                        }
                        float[] fArr = this.f19211k;
                        int i10 = this.f19205e;
                        fArr[i9] = i10;
                        this.f19212l[i9] = i10 - (this.f19209i / 2.0f);
                        i9++;
                    }
                    while (true) {
                        i7 = 4;
                        if (i6 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f19211k;
                        int i11 = this.f19206f;
                        fArr2[i6] = i11;
                        this.f19212l[i6] = i11 - (this.f19209i / 2.0f);
                        i6++;
                    }
                    while (true) {
                        if (i7 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f19211k;
                        int i12 = this.f19207g;
                        fArr3[i7] = i12;
                        this.f19212l[i7] = i12 - (this.f19209i / 2.0f);
                        i7++;
                    }
                    for (i8 = 6; i8 < 8; i8++) {
                        float[] fArr4 = this.f19211k;
                        int i13 = this.f19208h;
                        fArr4[i8] = i13;
                        this.f19212l[i8] = i13 - (this.f19209i / 2.0f);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (this.f19211k != null && this.f19212l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f19211k;
                    if (i9 >= fArr5.length) {
                        break;
                    }
                    int i14 = this.f19204d;
                    fArr5[i9] = i14;
                    this.f19212l[i9] = i14 - (this.f19209i / 2.0f);
                    i9++;
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        RectF rectF = this.f19214n;
        if (rectF != null) {
            int i15 = this.f19209i;
            rectF.set(i15 / 2.0f, i15 / 2.0f, this.f19202b - (i15 / 2.0f), this.f19203c - (i15 / 2.0f));
        }
        RectF rectF2 = this.f19213m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f19202b, this.f19203c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f19213m, null, 31);
            int i2 = this.f19202b;
            int i3 = this.f19209i;
            int i4 = this.f19203c;
            canvas.scale(((i2 - (i3 * 2)) * 1.0f) / i2, ((i4 - (i3 * 2)) * 1.0f) / i4, i2 / 2.0f, i4 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f19218r;
            if (paint != null) {
                paint.reset();
                this.f19218r.setAntiAlias(true);
                this.f19218r.setStyle(Paint.Style.FILL);
                this.f19218r.setXfermode(this.f19201a);
            }
            Path path = this.f19217q;
            if (path != null) {
                path.reset();
                this.f19217q.addRoundRect(this.f19213m, this.f19212l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f19217q, this.f19218r);
            Paint paint2 = this.f19218r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f19215o) {
                int i5 = this.f19209i;
                int i6 = this.f19210j;
                RectF rectF = this.f19214n;
                float[] fArr = this.f19211k;
                try {
                    Path path2 = this.f19217q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f19218r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i5);
                        this.f19218r.setColor(i6);
                        this.f19218r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f19217q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    if (canvas != null) {
                        canvas.drawPath(this.f19217q, this.f19218r);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e3) {
            aa.a("MBridgeImageView", e3.getMessage());
        }
    }

    public void setCornerRadius(int i2) {
        this.f19204d = i2;
    }

    public void setBorder(int i2, int i3, int i4) {
        this.f19215o = true;
        this.f19209i = i3;
        this.f19210j = i4;
        this.f19204d = i2;
    }

    public void setCustomBorder(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f19215o = true;
        this.f19216p = true;
        this.f19209i = i6;
        this.f19210j = i7;
        this.f19205e = i2;
        this.f19207g = i4;
        this.f19206f = i3;
        this.f19208h = i5;
    }
}
