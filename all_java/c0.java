package com.fyber.inneractive.sdk.mraid;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class c0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9711a;

    public c0(boolean z) {
        this.f9711a = z;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("viewable: ");
        sb.append(this.f9711a ? "true" : "false");
        return sb.toString();
    }
}
