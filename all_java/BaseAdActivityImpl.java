package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class BaseAdActivityImpl {
    public final Activity I;
    public int J = 0;

    protected BaseAdActivityImpl(Activity activity) {
        this.I = activity;
    }

    public abstract void A();

    public abstract void B();

    public void M() {
        this.I.finish();
    }

    public final boolean N() {
        return this.J == 1;
    }

    public abstract void a(int i2, int i3, Intent intent);

    public abstract void c();

    public abstract void d();

    protected final void f(int i2) {
        this.I.setContentView(sg.bigo.ads.common.utils.a.a(this.I, i2, null, false));
    }

    public abstract void f(boolean z);

    public final <T extends View> T g(int i2) {
        return (T) this.I.findViewById(i2);
    }

    public abstract void r();

    public abstract void v();
}
