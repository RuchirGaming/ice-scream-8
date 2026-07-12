package com.yandex.mobile.ads.instream;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public class InstreamAdBreakPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f37487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37488b;

    public enum Type {
        PERCENTS,
        MILLISECONDS,
        POSITION;

        Type() {
        }
    }

    public InstreamAdBreakPosition(Type type, long j2) {
        this.f37488b = j2;
        this.f37487a = type;
    }

    public Type getPositionType() {
        return this.f37487a;
    }

    public long getValue() {
        return this.f37488b;
    }
}
