package com.yodo1.mas.mediation.yodo1.kit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public class Yodo1CountDownView extends View {
    private int mCountdownTime;
    private float mCurrentProgress;
    private int mHeight;
    private OnCountDownFinishListener mListener;
    private final Paint mPaint;
    private final int mProgessTextColor;
    private RectF mRectF;
    private final int mRingColor;
    private final int mRingProgessTextSize;
    private final float mRingWidth;
    private int mWidth;

    public interface OnCountDownFinishListener {
        void countDownFinished();
    }

    public Yodo1CountDownView(Context context) {
        this(context, null);
    }

    public Yodo1CountDownView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Yodo1CountDownView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mRingColor = -16776961;
        this.mRingWidth = 10.0f;
        this.mRingProgessTextSize = 30;
        this.mProgessTextColor = -1;
        this.mCountdownTime = 60;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    public void setCountdownTime(int mCountdownTime) {
        this.mCountdownTime = mCountdownTime;
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
        float f2 = this.mRingWidth;
        this.mRectF = new RectF((f2 / 2.0f) + 0.0f, (f2 / 2.0f) + 0.0f, this.mWidth - (f2 / 2.0f), this.mHeight - (f2 / 2.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPaint.setColor(this.mRingColor);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.mRingWidth);
        canvas.drawArc(this.mRectF, -90.0f, this.mCurrentProgress - 360.0f, false, this.mPaint);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        StringBuilder sb = new StringBuilder();
        int i2 = this.mCountdownTime;
        sb.append(i2 - ((int) ((this.mCurrentProgress / 360.0f) * i2)));
        sb.append("");
        String string = sb.toString();
        paint.setTextSize(this.mRingProgessTextSize);
        paint.setColor(this.mProgessTextColor);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(string, this.mRectF.centerX(), (int) ((((this.mRectF.bottom + this.mRectF.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2.0f), paint);
    }

    private ValueAnimator getValA(long countdownTime) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        valueAnimatorOfFloat.setDuration(countdownTime);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(0);
        return valueAnimatorOfFloat;
    }

    public void startCountDown() {
        setClickable(false);
        ValueAnimator valA = getValA(this.mCountdownTime * 1000);
        valA.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yodo1.mas.mediation.yodo1.kit.Yodo1CountDownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                Yodo1CountDownView.this.mCurrentProgress = (int) ((Float.parseFloat(String.valueOf(animation.getAnimatedValue())) / 100.0f) * 360.0f);
                Yodo1CountDownView.this.invalidate();
            }
        });
        valA.start();
        valA.addListener(new AnimatorListenerAdapter() { // from class: com.yodo1.mas.mediation.yodo1.kit.Yodo1CountDownView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                if (Yodo1CountDownView.this.mListener != null) {
                    Yodo1CountDownView.this.mListener.countDownFinished();
                }
                Yodo1CountDownView.this.setClickable(true);
            }
        });
    }

    public void setAddCountDownListener(OnCountDownFinishListener mListener) {
        this.mListener = mListener;
    }
}
