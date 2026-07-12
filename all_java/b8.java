package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;

/* JADX INFO: compiled from: NativeMediaPlayer.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class b8 extends MediaPlayer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14080d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f14081e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b8 f14082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f14083g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b8 f14086c;

    /* JADX INFO: compiled from: NativeMediaPlayer.kt */
    public static final class a {
        public final b8 a() {
            a aVar = b8.f14080d;
            synchronized (b8.f14081e) {
                b8 b8Var = b8.f14082f;
                if (b8Var == null) {
                    return new b8();
                }
                a aVar2 = b8.f14080d;
                b8.f14082f = b8Var.f14086c;
                b8Var.f14086c = null;
                b8.f14083g--;
                return b8Var;
            }
        }
    }

    public final void a() {
        if (3 == this.f14084a) {
            return;
        }
        synchronized (f14081e) {
            int i2 = f14083g;
            if (i2 < 5) {
                this.f14086c = f14082f;
                f14082f = this;
                f14083g = i2 + 1;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
