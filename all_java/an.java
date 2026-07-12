package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: compiled from: ViewCoveredUtils.java */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f20642a = false;

    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9 A[SYNTHETIC] */
    public static boolean a(View view, int i2) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            aa.d("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            aa.d("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            aa.d("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        boolean z = ((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * (i2 == 1 ? 0.0f : 0.5f);
        boolean z2 = globalVisibleRect && z;
        aa.d("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
        StringBuilder sb = new StringBuilder();
        sb.append("View Judge : totalViewVisible is ");
        sb.append(z2);
        aa.d("ViewUtils", sb.toString());
        if (!z2) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            for (int iA = a(view2, viewGroup) + 1; iA < viewGroup.getChildCount(); iA++) {
                View childAt = viewGroup.getChildAt(iA);
                if (childAt.getVisibility() == 0 && a(view, childAt, i2)) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            aa.d("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean zA = a(view, viewGroup2, i2);
                            f20642a = false;
                            if (zA) {
                                return true;
                            }
                        } else if (a(childAt)) {
                            aa.d("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else if (a(childAt)) {
                        aa.d("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        aa.d("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    private static boolean a(View view) {
        if (view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) {
            return false;
        }
        return (Build.VERSION.SDK_INT < 19 || (view.getBackground() != null && view.getBackground().getAlpha() > 127)) && view.getAlpha() > 0.5f;
    }

    private static boolean a(View view, View view2, int i2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (!Rect.intersects(rect, rect2)) {
            return false;
        }
        int iMin = Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left);
        int iMin2 = Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top);
        return (i2 != 1 && (iMin * iMin2) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth()) || (i2 == 1 && iMin * iMin2 >= view.getMeasuredHeight() * view.getMeasuredWidth());
    }

    private static int a(View view, ViewGroup viewGroup) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount() && viewGroup.getChildAt(i2) != view) {
            i2++;
        }
        return i2;
    }

    private static boolean a(View view, ViewGroup viewGroup, int i2) {
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            aa.d("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0 && a(view, childAt, i2)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    aa.d("ViewUtils", "View Judge : View Covered by WebView.");
                    f20642a = true;
                }
                if (a(childAt)) {
                    aa.d("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f20642a = true;
                }
                if (f20642a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, i2);
                }
            }
        }
        return f20642a;
    }
}
