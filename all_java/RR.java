package com.yodo1.mas.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
@Deprecated
public final class RR {
    private static String _packageName;
    private static Resources _resources;

    private static final String packageName(Context context) {
        if (_packageName == null) {
            _packageName = context.getPackageName();
        }
        return _packageName;
    }

    private static final int identifier(Context context, String name, String type) {
        if (_resources == null) {
            _resources = context.getResources();
        }
        return _resources.getIdentifier(name, type, packageName(context));
    }

    public static final String stringTo(Context context, String name) {
        return context.getResources().getString(string(context, name));
    }

    public static final int string(Context context, String name) {
        return identifier(context, name, "string");
    }

    public static final int raw(Context context, String name) {
        return identifier(context, name, "raw");
    }

    public static final Drawable drawableTo(Context context, String name) {
        return context.getResources().getDrawable(drawable(context, name));
    }

    public static final int drawable(Context context, String name) {
        return identifier(context, name, "drawable");
    }

    public static final int mipmap(Context context, String name) {
        return identifier(context, name, "mipmap");
    }

    public static final int id(Context context, String name) {
        return identifier(context, name, "id");
    }

    public static final int layout(Context context, String name) {
        return identifier(context, name, TtmlNode.TAG_LAYOUT);
    }

    public static final int menu(Context context, String name) {
        return identifier(context, name, "menu");
    }

    public static final int style(Context context, String name) {
        return identifier(context, name, TtmlNode.TAG_STYLE);
    }

    public static final int dimen(Context context, String name) {
        return identifier(context, name, "dimen");
    }

    public static final int colorTo(Context context, String name) {
        return context.getResources().getColor(color(context, name));
    }

    public static final int color(Context context, String name) {
        return identifier(context, name, "color");
    }

    public static final int anim(Context context, String name) {
        return identifier(context, name, "anim");
    }

    public static final int attr(Context context, String name) {
        return identifier(context, name, "attr");
    }

    public static final int[] styleable(Class cls, String name) {
        for (Field field : cls.getFields()) {
            if (name.equals(field.getName())) {
                try {
                    return (int[]) field.get(cls);
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static final int styleableAttr(Class cls, String name) {
        for (Field field : cls.getFields()) {
            if (name.equals(field.getName())) {
                try {
                    return ((Integer) field.get(cls)).intValue();
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return 0;
    }
}
