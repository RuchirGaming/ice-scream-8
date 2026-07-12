package androidx.core.view;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f2, float f3, boolean z);

    boolean dispatchNestedPreFling(float f2, float f3);

    boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2);

    boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i2);

    void stopNestedScroll();
}
