package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public class v0 implements Comparable<v0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f12209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f12210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f12211c;

    public enum a {
        Primary(1),
        FallBack(2);

        public Integer mPriority;

        a(Integer num) {
            this.mPriority = num;
        }
    }

    public v0(a aVar, Uri uri, List<String> list) {
        this.f12209a = aVar;
        this.f12210b = uri;
        this.f12211c = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(v0 v0Var) {
        return this.f12209a.mPriority.compareTo(v0Var.f12209a.mPriority);
    }
}
