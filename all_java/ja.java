package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public final class ja {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final RectF f31886j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f31887k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f31888l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31889a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31890b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f31891c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f31892d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f31893e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f31894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextView f31895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f31896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f31897i;

    private static class a extends c {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.ja.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) ja.a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // com.yandex.mobile.ads.impl.ja.c
        final boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // com.yandex.mobile.ads.impl.ja.a, com.yandex.mobile.ads.impl.ja.c
        final void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean a(TextView textView) {
            return ((Boolean) ja.a(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public ja(TextView textView) {
        this.f31895g = textView;
        this.f31896h = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f31897i = new b();
        } else if (i2 >= 23) {
            this.f31897i = new a();
        } else {
            this.f31897i = new c();
        }
    }

    public final void a() {
        if (b()) {
            if (this.f31890b) {
                if (this.f31895g.getMeasuredHeight() <= 0 || this.f31895g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f31897i.a(this.f31895g) ? 1048576 : (this.f31895g.getMeasuredWidth() - this.f31895g.getTotalPaddingLeft()) - this.f31895g.getTotalPaddingRight();
                int height = (this.f31895g.getHeight() - this.f31895g.getCompoundPaddingBottom()) - this.f31895g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f31886j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fA = a(rectF);
                    if (fA != this.f31895g.getTextSize()) {
                        a(0, fA);
                    }
                }
            }
            this.f31890b = true;
        }
    }

    public final boolean b() {
        return ((this.f31895g instanceof EditText) ^ true) && this.f31889a != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:25:0x0084, B:23:0x0068, B:16:0x0049, B:18:0x0053, B:20:0x005d), top: B:34:0x0049, inners: #1 }] */
    public final void a(int i2, float f2) {
        Resources resources;
        Method declaredMethod;
        Context context = this.f31896h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (fApplyDimension != this.f31895g.getPaint().getTextSize()) {
            this.f31895g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = Build.VERSION.SDK_INT >= 18 ? this.f31895g.isInLayout() : false;
            if (this.f31895g.getLayout() != null) {
                this.f31890b = false;
                try {
                    try {
                        declaredMethod = f31887k.get("nullLayouts");
                        if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0])) != null) {
                            declaredMethod.setAccessible(true);
                            f31887k.put("nullLayouts", declaredMethod);
                            if (declaredMethod != null) {
                                declaredMethod.invoke(this.f31895g, new Object[0]);
                            }
                        } else if (declaredMethod != null) {
                            declaredMethod.invoke(this.f31895g, new Object[0]);
                        }
                    } catch (Exception e2) {
                        Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#nullLayouts() method", e2);
                        declaredMethod = null;
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (!zIsInLayout) {
                    this.f31895g.requestLayout();
                } else {
                    this.f31895g.forceLayout();
                }
                this.f31895g.invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    private int a(RectF rectF) {
        StaticLayout staticLayout;
        boolean z;
        boolean z2;
        CharSequence transformation;
        int length = this.f31893e.length;
        if (length != 0) {
            int i2 = 0;
            int i3 = length - 1;
            int i4 = 1;
            int i5 = 0;
            while (i4 <= i3) {
                int i6 = (i4 + i3) / 2;
                int i7 = this.f31893e[i6];
                CharSequence text = this.f31895g.getText();
                TransformationMethod transformationMethod = this.f31895g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f31895g)) != null) {
                    text = transformation;
                }
                int i8 = Build.VERSION.SDK_INT;
                int maxLines = i8 >= 16 ? this.f31895g.getMaxLines() : -1;
                TextPaint textPaint = this.f31894f;
                if (textPaint == null) {
                    this.f31894f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f31894f.set(this.f31895g.getPaint());
                this.f31894f.setTextSize(i7);
                Layout.Alignment alignment = (Layout.Alignment) a(this.f31895g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int iRound = Math.round(rectF.right);
                if (i8 >= 23) {
                    StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, i2, text.length(), this.f31894f, iRound);
                    builderObtain.setAlignment(alignment).setLineSpacing(this.f31895g.getLineSpacingExtra(), this.f31895g.getLineSpacingMultiplier()).setIncludePad(this.f31895g.getIncludeFontPadding()).setBreakStrategy(this.f31895g.getBreakStrategy()).setHyphenationFrequency(this.f31895g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                    try {
                        this.f31897i.a(builderObtain, this.f31895g);
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                    staticLayout = builderObtain.build();
                } else if (i8 >= 16) {
                    staticLayout = new StaticLayout(text, this.f31894f, iRound, alignment, this.f31895g.getLineSpacingMultiplier(), this.f31895g.getLineSpacingExtra(), this.f31895g.getIncludeFontPadding());
                } else {
                    TextView textView = this.f31895g;
                    Object objValueOf = Float.valueOf(1.0f);
                    try {
                        Field fieldA = a("mSpacingMult");
                        if (fieldA != null) {
                            objValueOf = fieldA.get(textView);
                        }
                    } catch (IllegalAccessException e2) {
                        Log.w("ACTVAutoSizeHelper", "Failed to access TextView#mSpacingMult member", e2);
                    }
                    float fFloatValue = ((Float) objValueOf).floatValue();
                    TextView textView2 = this.f31895g;
                    Object objValueOf2 = Float.valueOf(0.0f);
                    try {
                        Field fieldA2 = a("mSpacingAdd");
                        if (fieldA2 != null) {
                            objValueOf2 = fieldA2.get(textView2);
                        }
                    } catch (IllegalAccessException e3) {
                        Log.w("ACTVAutoSizeHelper", "Failed to access TextView#mSpacingAdd member", e3);
                    }
                    float fFloatValue2 = ((Float) objValueOf2).floatValue();
                    TextView textView3 = this.f31895g;
                    Object obj = Boolean.TRUE;
                    try {
                        Field fieldA3 = a("mIncludePad");
                        if (fieldA3 != null) {
                            obj = fieldA3.get(textView3);
                        }
                    } catch (IllegalAccessException e4) {
                        Log.w("ACTVAutoSizeHelper", "Failed to access TextView#mIncludePad member", e4);
                    }
                    staticLayout = new StaticLayout(text, this.f31894f, iRound, alignment, fFloatValue, fFloatValue2, ((Boolean) obj).booleanValue());
                }
                if (maxLines != -1) {
                    if (staticLayout.getLineCount() <= maxLines) {
                        z = true;
                        if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                        }
                        if (z2) {
                            i5 = i4;
                            i4 = i6 + 1;
                        } else {
                            i5 = i6 - 1;
                            i3 = i5;
                        }
                        i2 = 0;
                    } else {
                        z = true;
                    }
                    if (z2) {
                        i5 = i4;
                        i4 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i3 = i5;
                    }
                    i2 = 0;
                } else {
                    z = true;
                }
                z2 = ((float) staticLayout.getHeight()) > rectF.bottom ? false : z;
                if (z2) {
                    i5 = i4;
                    i4 = i6 + 1;
                } else {
                    i5 = i6 - 1;
                    i3 = i5;
                }
                i2 = 0;
            }
            return this.f31893e[i5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    static <T> T a(Object obj, String str, T t) {
        Method declaredMethod;
        try {
            declaredMethod = f31887k.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f31887k.put(str, declaredMethod);
            }
        } catch (Exception e2) {
            try {
                Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
                declaredMethod = null;
            } catch (Exception e3) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
                return t;
            }
        }
        return (T) declaredMethod.invoke(obj, new Object[0]);
    }

    private static Field a(String str) {
        try {
            Field declaredField = f31888l.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f31888l.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    public final void a(int i2) {
        if (!(this.f31895g instanceof EditText)) {
            if (i2 == 0) {
                this.f31889a = 0;
                this.f31892d = -1.0f;
                this.f31891c = -1.0f;
                this.f31893e = new int[0];
                this.f31890b = false;
                return;
            }
            if (i2 == 1) {
                DisplayMetrics displayMetrics = this.f31896h.getResources().getDisplayMetrics();
                float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                if (fApplyDimension <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
                }
                if (fApplyDimension2 > fApplyDimension) {
                    this.f31889a = 1;
                    this.f31892d = fApplyDimension;
                    this.f31891c = 1.0f;
                    if (!(this.f31895g instanceof EditText)) {
                        int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                        int[] iArr = new int[iFloor];
                        for (int i3 = 0; i3 < iFloor; i3++) {
                            iArr[i3] = Math.round((i3 * this.f31891c) + this.f31892d);
                        }
                        if (iFloor != 0) {
                            Arrays.sort(iArr);
                            ArrayList arrayList = new ArrayList();
                            for (int i4 = 0; i4 < iFloor; i4++) {
                                int i5 = iArr[i4];
                                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                                    arrayList.add(Integer.valueOf(i5));
                                }
                            }
                            if (iFloor != arrayList.size()) {
                                int size = arrayList.size();
                                iArr = new int[size];
                                for (int i6 = 0; i6 < size; i6++) {
                                    iArr[i6] = ((Integer) arrayList.get(i6)).intValue();
                                }
                            }
                        }
                        this.f31893e = iArr;
                        this.f31890b = true;
                    } else {
                        this.f31890b = false;
                    }
                    if (this.f31890b) {
                        a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
            }
            throw new IllegalArgumentException(ia.a("Unknown auto-size text type: ", i2));
        }
    }
}
