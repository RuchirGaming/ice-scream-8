package cn.thinkinganalyticsclone.android.encrypt;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public interface ITDEncrypt {
    String asymmetricEncryptType();

    String encryptDataEvent(String event);

    String encryptSymmetricKey(String publicKey);

    String symmetricEncryptType();
}
