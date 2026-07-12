package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<a> f3390a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.b("ThemeStatusBroadcastReceiver", "====ubject status update====");
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<a> weakReference = this.f3390a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f3390a.get().b(intExtra);
    }

    public void a(a aVar) {
        this.f3390a = new WeakReference<>(aVar);
    }
}
