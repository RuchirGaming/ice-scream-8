package androidx.browser.trusted;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface TokenStore {
    Token load();

    void store(Token token);
}
