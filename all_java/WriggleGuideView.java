package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class WriggleGuideView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f3636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f3637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f3638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Object> f3640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f3643j;

    public interface a {
        void a();
    }

    public WriggleGuideView(Context context) {
        this(context, null);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3634a = 0;
        this.f3635b = 0;
        this.f3639f = 0;
        ArrayList arrayList = new ArrayList();
        this.f3640g = arrayList;
        this.f3641h = true;
        this.f3642i = false;
        setLayerType(1, null);
        this.f3638e = new Paint();
        this.f3638e = new Paint(1);
        arrayList.clear();
    }

    private Bitmap a(int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), s.d(getContext(), "tt_wriggle_union"));
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new RectF(0.0f, 0.0f, i2, i3), this.f3638e);
        }
        return bitmapCreateBitmap;
    }

    private Bitmap b(int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), s.d(getContext(), "tt_wriggle_union_white"));
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new RectF(0.0f, 0.0f, i2, i3), paint);
        }
        return bitmapCreateBitmap;
    }

    private Bitmap c(int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(i2 / 2, 10.0f, this.f3639f, paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3641h) {
            this.f3634a = getWidth();
            int height = getHeight();
            this.f3635b = height;
            this.f3636c = a(this.f3634a, height);
            this.f3637d = b(this.f3634a, this.f3635b);
            this.f3641h = false;
        }
        canvas.drawBitmap(this.f3636c, 0.0f, 0.0f, this.f3638e);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.drawBitmap(this.f3637d, 0.0f, 0.0f, this.f3638e);
        this.f3638e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(c(this.f3634a, this.f3635b), 0.0f, 0.0f, this.f3638e);
        this.f3638e.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        if (this.f3642i) {
            this.f3639f += 5;
            invalidate();
            if (this.f3639f >= this.f3634a) {
                a aVar = this.f3643j;
                if (aVar != null) {
                    aVar.a();
                }
                this.f3642i = false;
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3643j != null) {
            this.f3643j = null;
        }
    }
}
