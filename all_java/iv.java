package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public enum iv {
    f31720b("NO_ERROR"),
    f31721c("PROTOCOL_ERROR"),
    f31722d("INTERNAL_ERROR"),
    f31723e("FLOW_CONTROL_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("SETTINGS_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("STREAM_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("FRAME_SIZE_ERROR"),
    f31724f("REFUSED_STREAM"),
    f31725g("CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF91("COMPRESSION_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF100("CONNECT_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("ENHANCE_YOUR_CALM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF118("INADEQUATE_SECURITY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF127("HTTP_1_1_REQUIRED");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31727a;

    public static final class a {
        public static iv a(int i2) {
            for (iv ivVar : iv.values()) {
                if (ivVar.a() == i2) {
                    return ivVar;
                }
            }
            return null;
        }
    }

    iv(String str) {
        this.f31727a = i;
    }

    public final int a() {
        return this.f31727a;
    }
}
