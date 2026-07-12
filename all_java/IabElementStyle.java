package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class IabElementStyle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f8494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f8495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f8496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f8497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f8498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f8499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f8501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f8502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f8503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f8504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f8505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f8506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f8507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f8508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f8509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f8510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f8511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float f8512s;
    private Float t;
    private Float u;
    private Integer v;
    private Float w;

    public IabElementStyle() {
    }

    public IabElementStyle(IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }

    public void applyAlignment(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(Context context, View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 17) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyRelativeAlignment(android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 17
            r2 = 1
            if (r0 == r2) goto L1c
            r2 = 3
            if (r0 == r2) goto L19
            r2 = 5
            if (r0 == r2) goto L16
            if (r0 == r1) goto L1c
            goto L21
        L16:
            r0 = 11
            goto L1e
        L19:
            r0 = 9
            goto L1e
        L1c:
            r0 = 14
        L1e:
            r4.addRule(r0)
        L21:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r2 = 16
            if (r0 == r2) goto L3e
            if (r0 == r1) goto L3e
            r1 = 48
            if (r0 == r1) goto L3b
            r1 = 80
            if (r0 == r1) goto L38
            goto L43
        L38:
            r0 = 12
            goto L40
        L3b:
            r0 = 10
            goto L40
        L3e:
            r0 = 15
        L40:
            r4.addRule(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.IabElementStyle.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    public IabElementStyle copyWith(IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    public String getContent() {
        return this.f8511r;
    }

    public Integer getFillColor() {
        Integer num = this.f8495b;
        return num != null ? num : Integer.valueOf(Assets.backgroundColor);
    }

    public Float getFontSize(Context context) {
        Float f2 = this.w;
        return Float.valueOf(Utils.dpToPx(context, f2 != null ? f2.floatValue() : 16.0f));
    }

    public Integer getFontStyle() {
        Integer num = this.v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer getHeight(Context context) {
        int iIntValue;
        Float f2 = this.u;
        if (f2 != null) {
            iIntValue = (f2.floatValue() == -1.0f || this.u.floatValue() == -2.0f) ? this.u.intValue() : Utils.dpToPx(context, this.u.floatValue());
        } else {
            iIntValue = -2;
        }
        return Integer.valueOf(iIntValue);
    }

    public Float getHideAfter() {
        return this.f8502i;
    }

    public Integer getHorizontalPosition() {
        Integer num = this.f8498e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer getMarginBottom(Context context) {
        Integer num = this.f8510q;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getMarginLeft(Context context) {
        Integer num = this.f8507n;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getMarginRight(Context context) {
        Integer num = this.f8509p;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getMarginTop(Context context) {
        Integer num = this.f8508o;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Float getOpacity() {
        Float f2 = this.f8501h;
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    public Integer getPaddingBottom(Context context) {
        Integer num = this.f8506m;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getPaddingLeft(Context context) {
        Integer num = this.f8503j;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getPaddingRight(Context context) {
        Integer num = this.f8504k;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getPaddingTop(Context context) {
        Integer num = this.f8505l;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    public Integer getStrokeColor() {
        Integer num = this.f8494a;
        return num != null ? num : Integer.valueOf(Assets.mainAssetsColor);
    }

    public Float getStrokeWidth(Context context) {
        Float f2 = this.f8512s;
        return Float.valueOf(f2 != null ? Utils.dpToPx(context, f2.floatValue()) : 0.0f);
    }

    public String getStyle() {
        return this.f8500g;
    }

    public Integer getVerticalPosition() {
        Integer num = this.f8499f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer getWidth(Context context) {
        int iIntValue;
        Float f2 = this.t;
        if (f2 != null) {
            iIntValue = (f2.floatValue() == -1.0f || this.t.floatValue() == -2.0f) ? this.t.intValue() : Utils.dpToPx(context, this.t.floatValue());
        } else {
            iIntValue = -2;
        }
        return Integer.valueOf(iIntValue);
    }

    public boolean hasFillColor() {
        return this.f8495b != null;
    }

    public boolean hasStrokeColor() {
        return this.f8494a != null;
    }

    public Boolean isOutlined() {
        Boolean bool = this.f8496c;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean isVisible() {
        Boolean bool = this.f8497d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(IabElementStyle iabElementStyle) {
        if (iabElementStyle == null) {
            return;
        }
        Integer num = iabElementStyle.f8494a;
        if (num != null) {
            this.f8494a = num;
        }
        Integer num2 = iabElementStyle.f8495b;
        if (num2 != null) {
            this.f8495b = num2;
        }
        Boolean bool = iabElementStyle.f8496c;
        if (bool != null) {
            this.f8496c = bool;
        }
        Boolean bool2 = iabElementStyle.f8497d;
        if (bool2 != null) {
            this.f8497d = bool2;
        }
        Integer num3 = iabElementStyle.f8498e;
        if (num3 != null) {
            this.f8498e = num3;
        }
        Integer num4 = iabElementStyle.f8499f;
        if (num4 != null) {
            this.f8499f = num4;
        }
        String str = iabElementStyle.f8500g;
        if (str != null) {
            this.f8500g = str;
        }
        Float f2 = iabElementStyle.f8501h;
        if (f2 != null) {
            this.f8501h = f2;
        }
        Float f3 = iabElementStyle.f8502i;
        if (f3 != null) {
            this.f8502i = f3;
        }
        Integer num5 = iabElementStyle.f8503j;
        if (num5 != null) {
            this.f8503j = num5;
        }
        Integer num6 = iabElementStyle.f8504k;
        if (num6 != null) {
            this.f8504k = num6;
        }
        Integer num7 = iabElementStyle.f8505l;
        if (num7 != null) {
            this.f8505l = num7;
        }
        Integer num8 = iabElementStyle.f8506m;
        if (num8 != null) {
            this.f8506m = num8;
        }
        Integer num9 = iabElementStyle.f8507n;
        if (num9 != null) {
            this.f8507n = num9;
        }
        Integer num10 = iabElementStyle.f8509p;
        if (num10 != null) {
            this.f8509p = num10;
        }
        Integer num11 = iabElementStyle.f8508o;
        if (num11 != null) {
            this.f8508o = num11;
        }
        Integer num12 = iabElementStyle.f8510q;
        if (num12 != null) {
            this.f8510q = num12;
        }
        String str2 = iabElementStyle.f8511r;
        if (str2 != null) {
            this.f8511r = str2;
        }
        Float f4 = iabElementStyle.f8512s;
        if (f4 != null) {
            this.f8512s = f4;
        }
        Float f5 = iabElementStyle.t;
        if (f5 != null) {
            this.t = f5;
        }
        Float f6 = iabElementStyle.u;
        if (f6 != null) {
            this.u = f6;
        }
        Integer num13 = iabElementStyle.v;
        if (num13 != null) {
            this.v = num13;
        }
        Float f7 = iabElementStyle.w;
        if (f7 != null) {
            this.w = f7;
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(String str) {
        this.f8511r = str;
    }

    public void setFillColor(Integer num) {
        this.f8495b = num;
    }

    public void setFontSize(Float f2) {
        this.w = f2;
    }

    public void setFontStyle(Integer num) {
        this.v = num;
    }

    public void setHeight(Number number) {
        this.u = Float.valueOf(number.floatValue());
    }

    public void setHideAfter(Float f2) {
        this.f8502i = f2;
    }

    public void setHorizontalPosition(Integer num) {
        this.f8498e = num;
    }

    public void setMargin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f8507n = num;
        this.f8508o = num2;
        this.f8509p = num3;
        this.f8510q = num4;
    }

    public void setMargin(String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setMargin(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setMargin(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setMargin(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setMargin(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setMarginBottom(Integer num) {
        this.f8510q = num;
    }

    public void setMarginLeft(Integer num) {
        this.f8507n = num;
    }

    public void setMarginRight(Integer num) {
        this.f8509p = num;
    }

    public void setMarginTop(Integer num) {
        this.f8508o = num;
    }

    public void setOpacity(Float f2) {
        this.f8501h = f2;
    }

    public void setOutlined(Boolean bool) {
        this.f8496c = bool;
    }

    public void setPadding(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f8503j = num;
        this.f8505l = num2;
        this.f8504k = num3;
        this.f8506m = num4;
    }

    public void setPadding(String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setPadding(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setPadding(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setPadding(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setPadding(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setPaddingBottom(Integer num) {
        this.f8506m = num;
    }

    public void setPaddingLeft(Integer num) {
        this.f8503j = num;
    }

    public void setPaddingRight(Integer num) {
        this.f8504k = num;
    }

    public void setPaddingTop(Integer num) {
        this.f8505l = num;
    }

    public void setStrokeColor(Integer num) {
        this.f8494a = num;
    }

    public void setStrokeWidth(Float f2) {
        this.f8512s = f2;
    }

    public void setStyle(String str) {
        this.f8500g = str;
    }

    public void setVerticalPosition(Integer num) {
        this.f8499f = num;
    }

    public void setVisible(Boolean bool) {
        this.f8497d = bool;
    }

    public void setWidth(Number number) {
        this.t = Float.valueOf(number.floatValue());
    }
}
