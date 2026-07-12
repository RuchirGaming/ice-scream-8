package com.mbridge.msdk.playercommon.exoplayer2.text.cea;

import android.text.Layout;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class Cea708Cue extends Cue implements Comparable<Cea708Cue> {
    public static final int PRIORITY_UNSET = -1;
    public final int priority;

    public Cea708Cue(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4, z, i5);
        this.priority = i6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Cea708Cue cea708Cue) {
        int i2 = cea708Cue.priority;
        int i3 = this.priority;
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }
}
