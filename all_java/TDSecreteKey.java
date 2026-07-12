package cn.thinkinganalyticsclone.android.encrypt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDSecreteKey {
    public String asymmetricEncryption;
    public String publicKey;
    public String symmetricEncryption;
    public int version;

    public TDSecreteKey() {
    }

    public TDSecreteKey(String publicKey, int version, String symmetricEncryption, String asymmetricEncryption) {
        this.publicKey = publicKey;
        this.version = version;
        this.symmetricEncryption = symmetricEncryption;
        this.asymmetricEncryption = asymmetricEncryption;
    }
}
