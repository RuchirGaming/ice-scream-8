package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f39614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f39615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f39616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f39617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Hashtable f39618e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f39622d;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f39618e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, int i2, int i3) {
        super(context);
        this.f39618e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39618e = new Hashtable();
    }

    private int a(int i2, int i3) {
        if (i2 <= 0) {
            return getPaddingLeft();
        }
        int i4 = i3 - 1;
        return a(i2 - 1, i4) + getChildAt(i4).getMeasuredWidth() + 30;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) this.f39618e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f39619a, aVar.f39620b, aVar.f39621c, aVar.f39622d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        byte b2 = 0;
        this.f39614a = 0;
        this.f39615b = 0;
        this.f39616c = 5;
        this.f39617d = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i4 += measuredWidth;
            a aVar = new a(b2);
            int iA = a(i7 - i5, i7);
            this.f39614a = iA;
            this.f39615b = iA + childAt.getMeasuredWidth();
            if (i4 >= size) {
                this.f39614a = 0;
                this.f39615b = childAt.getMeasuredWidth() + 0;
                this.f39616c = i6 + measuredHeight + layoutParams.topMargin;
                i5 = i7;
                i4 = measuredWidth;
            }
            this.f39617d = this.f39616c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            i6 = this.f39616c;
            aVar.f39619a = this.f39614a;
            aVar.f39620b = this.f39616c + 3;
            aVar.f39621c = this.f39615b;
            aVar.f39622d = this.f39617d;
            this.f39618e.put(childAt, aVar);
        }
        setMeasuredDimension(size, this.f39617d);
    }
}
