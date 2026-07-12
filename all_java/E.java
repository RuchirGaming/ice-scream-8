package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class E implements F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Integer> f24708a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f24709b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile a f24710c = a.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<b> f24711d = new CopyOnWriteArraySet();

    public enum a {
        UNKNOWN("unknown"),
        BACKGROUND("background"),
        VISIBLE("visible");

        a(String str) {
        }
    }

    public interface b {
        void a(a aVar);
    }

    private void d() {
        a aVar = a.UNKNOWN;
        if (!this.f24708a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f24709b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f24710c != aVar) {
            this.f24710c = aVar;
            Iterator<b> it = this.f24711d.iterator();
            while (it.hasNext()) {
                it.next().a(this.f24710c);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        d();
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        if (this.f24710c == a.VISIBLE) {
            this.f24710c = a.BACKGROUND;
        }
    }

    public a c() {
        return this.f24710c;
    }

    public a a(b bVar) {
        this.f24711d.add(bVar);
        return this.f24710c;
    }

    public void c(int i2) {
        this.f24708a.add(Integer.valueOf(i2));
        this.f24709b.remove(Integer.valueOf(i2));
        d();
    }

    public void b(int i2) {
        this.f24709b.add(Integer.valueOf(i2));
        this.f24708a.remove(Integer.valueOf(i2));
        d();
    }

    public void a(int i2) {
        this.f24708a.remove(Integer.valueOf(i2));
        d();
    }
}
