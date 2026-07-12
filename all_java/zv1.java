package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes7.dex */
public abstract class zv1 extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f37461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b f37462b;

    public interface a {
    }

    public interface b {
    }

    public zv1(b bVar) {
        this.f37462b = bVar;
    }

    public final void a(a aVar) {
        this.f37461a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f37461a;
        if (aVar != null) {
            ((ew1) aVar).a();
        }
    }
}
