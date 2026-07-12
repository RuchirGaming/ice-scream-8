package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes6.dex */
public enum E0 {
    UNDEFINED("UNDEFINED"),
    APP("APP"),
    SATELLITE("SATELLITE"),
    RETAIL("RETAIL");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f24721g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24722a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    E0(String str) {
        this.f24722a = str;
    }

    public final String a() {
        return this.f24722a;
    }
}
