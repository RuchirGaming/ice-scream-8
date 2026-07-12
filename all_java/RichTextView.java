package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes2.dex */
public class RichTextView extends TextView {
    public RichTextView(Context context) {
        super(context);
    }

    public void setRichText(String str) {
        Spanned spannedFromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            spannedFromHtml = Html.fromHtml(str, 0);
        } else {
            spannedFromHtml = Html.fromHtml(str);
        }
        setText(spannedFromHtml);
    }
}
