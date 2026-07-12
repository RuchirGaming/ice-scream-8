package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class C2245t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC2400z6 f28123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f28124b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.t6$b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private EnumC2400z6 f28125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f28126b;

        private b(EnumC2400z6 enumC2400z6) {
            this.f28125a = enumC2400z6;
        }

        public b a(int i2) {
            this.f28126b = Integer.valueOf(i2);
            return this;
        }

        public C2245t6 a() {
            return new C2245t6(this);
        }
    }

    public static final b a(EnumC2400z6 enumC2400z6) {
        return new b(enumC2400z6);
    }

    public EnumC2400z6 b() {
        return this.f28123a;
    }

    private C2245t6(b bVar) {
        this.f28123a = bVar.f28125a;
        this.f28124b = bVar.f28126b;
    }

    public Integer a() {
        return this.f28124b;
    }
}
