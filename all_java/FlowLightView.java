package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class FlowLightView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Rect f3492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Rect f3493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f3500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Bitmap f3501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f3502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Xfermode f3503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f3504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearGradient f3505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<a> f3506o;

    public FlowLightView(Context context) {
        super(context);
        this.f3504m = PorterDuff.Mode.DST_IN;
        this.f3506o = new ArrayList();
        a();
    }

    private void a() {
        this.f3494c = s.d(getContext(), "tt_splash_unlock_image_arrow");
        this.f3495d = Color.parseColor("#00ffffff");
        this.f3496e = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f3497f = color;
        this.f3498g = 10;
        this.f3499h = 40;
        this.f3500i = new int[]{this.f3495d, this.f3496e, color};
        setLayerType(1, null);
        this.f3502k = new Paint(1);
        this.f3501j = BitmapFactory.decodeResource(getResources(), this.f3494c);
        this.f3503l = new PorterDuffXfermode(this.f3504m);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f3501j, this.f3492a, this.f3493b, this.f3502k);
        canvas.save();
        Iterator<a> it = this.f3506o.iterator();
        while (it.hasNext()) {
            a next = it.next();
            this.f3505n = new LinearGradient(next.f3508b, 0.0f, next.f3508b + this.f3499h, this.f3498g, this.f3500i, (float[]) null, Shader.TileMode.CLAMP);
            this.f3502k.setColor(-1);
            this.f3502k.setShader(this.f3505n);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f3502k);
            this.f3502k.setShader(null);
            next.a();
            if (next.f3508b > getWidth()) {
                it.remove();
            }
        }
        this.f3502k.setXfermode(this.f3503l);
        canvas.drawBitmap(this.f3501j, this.f3492a, this.f3493b, this.f3502k);
        this.f3502k.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.f3501j == null) {
            return;
        }
        this.f3492a = new Rect(0, 0, this.f3501j.getWidth(), this.f3501j.getHeight());
        this.f3493b = new Rect(0, 0, getWidth(), getHeight());
    }

    public void a(int i2) {
        this.f3506o.add(new a(i2));
        postInvalidate();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3508b = 0;

        public a(int i2) {
            this.f3507a = i2;
        }

        public void a() {
            this.f3508b += this.f3507a;
        }
    }
}
