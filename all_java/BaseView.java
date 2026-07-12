package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.t;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f21493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f21494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f21495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f21496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f21497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f21498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f21499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f21500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f21501i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public FrameLayout getmAnimationContent() {
        return this.f21499g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f21500h;
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(t.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f21501i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f21493a = (RelativeLayout) viewInflate.findViewById(t.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f21494b = (RelativeLayout) viewInflate.findViewById(t.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f21495c = (RelativeLayout) viewInflate.findViewById(t.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f21496d = (ImageView) viewInflate.findViewById(t.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f21497e = (TextView) viewInflate.findViewById(t.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f21498f = (ProgressBar) viewInflate.findViewById(t.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f21499g = (FrameLayout) viewInflate.findViewById(t.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f21500h = (LinearLayout) viewInflate.findViewById(t.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f21493a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f21494b;
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f21495c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f21496d;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f21497e;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f21498f;
    }

    public a getStytle() {
        return this.style;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
