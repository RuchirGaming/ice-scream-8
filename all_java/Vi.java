package com.yandex.metrica.impl.ob;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public class Vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f26109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26110b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f26112b;

        public a(int i2, long j2) {
            this.f26111a = i2;
            this.f26112b = j2;
        }

        public String toString() {
            return "Item{refreshEventCount=" + this.f26111a + ", refreshPeriodSeconds=" + this.f26112b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public enum b {
        WIFI,
        CELL
    }

    public Vi(a aVar, a aVar2) {
        this.f26109a = aVar;
        this.f26110b = aVar2;
    }

    public String toString() {
        return "ThrottlingConfig{cell=" + this.f26109a + ", wifi=" + this.f26110b + AbstractJsonLexerKt.END_OBJ;
    }
}
