package com.squareup.picasso;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public interface Callback {

    public static class EmptyCallback implements Callback {
        @Override // com.squareup.picasso.Callback
        public void onError(Exception exc) {
        }

        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
        }
    }

    void onError(Exception exc);

    void onSuccess();
}
