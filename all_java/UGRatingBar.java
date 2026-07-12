package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.b;
import com.bytedance.adsdk.ugeno.c.d;
import com.bytedance.adsdk.ugeno.c.h;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class UGRatingBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f2644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f2645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f2646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f2647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private LinearLayout f2648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout f2649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f2650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f2651j;

    public UGRatingBar(Context context) {
        super(context);
        this.f2650i = context;
        this.f2648g = new LinearLayout(context);
        this.f2649h = new LinearLayout(context);
        this.f2648g.setOrientation(0);
        this.f2648g.setGravity(GravityCompat.START);
        this.f2649h.setOrientation(0);
        this.f2649h.setGravity(GravityCompat.START);
        this.f2644c = d.a(context, "tt_star_thick");
        this.f2645d = d.a(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f2644c;
    }

    public Drawable getStarFillDrawable() {
        return this.f2645d;
    }

    public void a(double d2, int i2, int i3, int i4) {
        removeAllViews();
        this.f2648g.removeAllViews();
        this.f2649h.removeAllViews();
        float f2 = i3;
        this.f2642a = (int) h.a(this.f2650i, f2);
        this.f2643b = (int) h.a(this.f2650i, f2);
        this.f2646e = d2;
        this.f2647f = i4;
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f2649h.addView(starImageView);
        }
        for (int i6 = 0; i6 < 5; i6++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f2648g.addView(starImageView2);
        }
        addView(this.f2648g);
        addView(this.f2649h);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.f2642a, (int) this.f2643b);
        layoutParams.leftMargin = 1;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 1;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        b bVar = this.f2651j;
        if (bVar != null) {
            bVar.a(i2, i3);
        }
        super.onMeasure(i2, i3);
        this.f2648g.measure(i2, i3);
        double dFloor = Math.floor(this.f2646e);
        float f2 = this.f2642a;
        this.f2649h.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (2.0f + f2)) * dFloor) + 1.0d + ((this.f2646e - dFloor) * ((double) f2))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f2648g.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        b bVar = this.f2651j;
        if (bVar != null) {
            bVar.a(i2, i3, i4, i5);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.f2651j;
        if (bVar != null) {
            bVar.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2651j;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2651j;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void a(b bVar) {
        this.f2651j = bVar;
    }
}
