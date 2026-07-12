package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
final class iy {
    iy() {
    }

    static PopupMenu a(Context context, ImageView imageView, List list) {
        PopupMenu popupMenu = Build.VERSION.SDK_INT >= 19 ? new PopupMenu(context, imageView, 5) : new PopupMenu(context, imageView);
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < list.size(); i2++) {
            menu.add(0, i2, 0, ((yx.a) list.get(i2)).a());
        }
        return popupMenu;
    }
}
