package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
class Dk implements InterfaceC2186ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Wn f24705a;

    Dk() {
        this(new Wn());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2186ql
    public Bundle a(Activity activity) {
        ActivityInfo activityInfo;
        Wn wn = this.f24705a;
        ComponentName componentName = activity.getComponentName();
        wn.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    Dk(Wn wn) {
        this.f24705a = wn;
    }
}
