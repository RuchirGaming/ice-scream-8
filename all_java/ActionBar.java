package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class ActionBar extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f21299a;

    public interface a {
        View a();

        void a(View view, WebView webView);
    }

    public ActionBar(Context context) {
        super(context);
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof a) {
            ((a) tag).a(view, this.f21299a);
        }
    }

    public WebView getWebView() {
        return this.f21299a;
    }

    public void setWebView(WebView webView) {
        this.f21299a = webView;
    }

    public void addAction(a aVar) {
        addAction(aVar, getChildCount());
    }

    public void removeAllActions() {
        removeAllViews();
    }

    public void removeActionAt(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            return;
        }
        removeViewAt(i2);
    }

    public boolean removeAction(a aVar) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof a) && tag.equals(aVar)) {
                    removeView(childAt);
                    return true;
                }
            }
        }
        return false;
    }

    public int getActionCount() {
        return getChildCount();
    }

    public View newActionItem() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    public void addAction(a aVar, int i2) {
        View viewNewActionItem;
        View viewA = aVar.a();
        if (viewA != null) {
            viewNewActionItem = newActionItem();
            ((ViewGroup) ((ViewGroup) viewNewActionItem).getChildAt(0)).addView(viewA);
            viewA.setTag(aVar);
            viewA.setOnClickListener(this);
        } else {
            viewNewActionItem = null;
        }
        addView(viewNewActionItem, i2);
    }
}
