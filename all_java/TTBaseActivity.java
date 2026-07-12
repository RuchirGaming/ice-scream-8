package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.l;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class TTBaseActivity extends Activity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f4587g = false;

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT <= 28 && Build.VERSION.SDK_INT >= 24) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e2) {
                l.c("TTBaseActivity", "super.onResume() run fail", e2);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, true);
                    return;
                } catch (Exception e3) {
                    l.c("TTBaseActivity", "onResume set mCalled fail", e3);
                    return;
                }
            }
        }
        super.onResume();
    }

    public void a(boolean z) {
        this.f4587g = z;
    }
}
