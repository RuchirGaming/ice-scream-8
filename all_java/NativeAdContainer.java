package io.bidmachine.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.utils.ViewHelper;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
class NativeAdContainer extends FrameLayout {
    FrameLayout innerContainer;
    View previousConfiguredAdContainer;

    public NativeAdContainer(Context context) {
        super(context);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(context);
    }

    private void init(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.innerContainer = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i2);
        } else {
            super.addView(view, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i2, i3);
        } else {
            super.addView(view, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i2, layoutParams);
        } else {
            super.addView(view, i2, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.previousConfiguredAdContainer) {
            removePreviousAdContainer();
            return;
        }
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.bringChildToFront(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    protected void configureContainer(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        super.removeView(this.innerContainer);
        ViewHelper.removeViewFromParent(this.innerContainer);
        ViewHelper.removeViewFromParent(viewGroup);
        removePreviousAdContainer();
        super.addView(viewGroup, 0, layoutParams);
        viewGroup.addView(this.innerContainer, 0, layoutParams);
        this.previousConfiguredAdContainer = viewGroup;
    }

    protected void deConfigureContainer() {
        if (this.previousConfiguredAdContainer != null) {
            ViewHelper.removeViewFromParent(this.innerContainer);
            removePreviousAdContainer();
            super.addView(this.innerContainer, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    protected void removePreviousAdContainer() {
        View view = this.previousConfiguredAdContainer;
        if (view != null) {
            super.removeView(view);
            this.previousConfiguredAdContainer = null;
        }
    }
}
