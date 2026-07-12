package androidx.core.net;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String str) {
        super(str);
        this.response = str;
    }
}
