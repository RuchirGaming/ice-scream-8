package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25908a;

    public Ti(int i2) {
        this.f25908a = i2;
    }

    public final int a() {
        return this.f25908a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Ti) && this.f25908a == ((Ti) obj).f25908a;
        }
        return true;
    }

    public int hashCode() {
        return this.f25908a;
    }

    public String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f25908a + ")";
    }
}
