package com.google.android.datatransport.runtime.retries;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface RetryStrategy<TInput, TResult> {
    TInput shouldRetry(TInput tinput, TResult tresult);
}
