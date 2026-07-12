package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
final class V2<T, R> implements Wm<WallpaperManager, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f26004a;

    V2(int i2) {
        this.f26004a = i2;
    }

    @Override // com.yandex.metrica.impl.ob.Wm
    public Integer a(WallpaperManager wallpaperManager) {
        return Integer.valueOf(wallpaperManager.getWallpaperId(this.f26004a));
    }
}
