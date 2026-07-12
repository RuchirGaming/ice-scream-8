package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f4400a;

    public interface a {
        void a();

        void b();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            Log.i("HomeReceiver", "onReceive: action: " + action);
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                Log.i("HomeReceiver", "reason: " + stringExtra);
                if ("homekey".equals(stringExtra)) {
                    Log.i("HomeReceiver", "homekey");
                    a aVar = this.f4400a;
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if ("recentapps".equals(stringExtra)) {
                    Log.i("HomeReceiver", "long press home key or activity switch");
                    a aVar2 = this.f4400a;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                } else if ("assist".equals(stringExtra)) {
                    Log.i("HomeReceiver", "assist");
                }
            }
        } catch (Throwable unused) {
            l.e("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throwable");
        }
    }

    public void a(a aVar) {
        this.f4400a = aVar;
    }
}
