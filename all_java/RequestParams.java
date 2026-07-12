package io.bidmachine.models;

import io.bidmachine.models.RequestParams;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes8.dex */
public abstract class RequestParams<SelfType extends RequestParams<SelfType>> {
    public abstract void merge(SelfType selftype);

    public static <T extends RequestParams<T>> T resolveParams(T t, T t2) {
        if (t == null) {
            return t2;
        }
        if (t2 != null) {
            t.merge(t2);
        }
        return t;
    }
}
