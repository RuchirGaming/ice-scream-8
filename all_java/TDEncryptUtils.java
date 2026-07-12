package cn.thinkinganalyticsclone.android.encrypt;

import android.text.TextUtils;
import cn.thinkinganalyticsclone.android.utils.Base64Coder;
import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDEncryptUtils {
    private static final String TAG = "ThinkingAnalyticsClone.TAEncryptUtils";

    static byte[] generateAESKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return keyGenerator.generateKey().getEncoded();
    }

    static String rsaEncrypt(String publicKey, byte[] content) {
        if (TextUtils.isEmpty(publicKey)) {
            TDLog.i(TAG, "PublicKey is null.");
            return null;
        }
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(TDBase64.decode(publicKey)));
            Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
            cipher.init(1, publicKeyGeneratePublic);
            return new String(Base64Coder.encode(cipher.doFinal(content)));
        } catch (Exception e2) {
            TDLog.d(TAG, "AES加密失败:" + e2.getMessage());
            return null;
        }
    }

    static String aesEncrypt(byte[] key, String content) {
        if (key != null && content != null) {
            byte[] bytes = content.getBytes();
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
                Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
                cipher.init(1, secretKeySpec);
                return new String(Base64Coder.encode(cipher.doFinal(bytes)));
            } catch (Exception e2) {
                TDLog.d(TAG, "RSA加密失败:" + e2.getMessage());
            }
        }
        return null;
    }

    public static boolean hasEncryptedData(JSONArray array) {
        for (int i2 = 0; i2 < array.length(); i2++) {
            try {
                if (isEncryptedData(array.getJSONObject(i2))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean isEncryptedData(JSONObject json) {
        return json != null && json.length() == 3 && json.has("ekey") && json.has("pkv") && json.has("payload");
    }
}
