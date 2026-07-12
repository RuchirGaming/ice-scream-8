package cn.thinkinganalyticsclone.android.utils;

import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class PropertyUtils {
    private static final String TAG = "ThinkingAnalyticsClone.PropertyUtils";
    private static final Pattern KEY_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z\\d_]{0,49}$", 2);
    private static final ArrayList<String> DEFAULT_KEYS = new ArrayList() { // from class: cn.thinkinganalyticsclone.android.utils.PropertyUtils.1
        {
            add(TDConstants.KEY_BUNDLE_ID);
            add(TDConstants.KEY_DURATION);
        }
    };

    public static boolean isInvalidName(String string) {
        return string == null || !KEY_PATTERN.matcher(string).matches();
    }

    public static boolean checkProperty(JSONObject properties) {
        if (properties == null || !TDLog.mEnableLog) {
            return true;
        }
        Iterator<String> itKeys = properties.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(next)) {
                TDLog.d(TAG, "Empty property name is not allowed.");
            }
            if (!KEY_PATTERN.matcher(next).matches() && !DEFAULT_KEYS.contains(next)) {
                TDLog.d(TAG, "Property name[" + next + "] is not valid. The property KEY must be string that starts with English letter, and contains letter, number, and '_'. The max length of the property KEY is 50. ");
            }
            try {
                Object obj = properties.get(next);
                if (!(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Date) && !(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                    TDLog.d(TAG, "Property value must be type String, Number, Boolean, Date, JSONObject or JSONArray");
                }
                if (obj instanceof Number) {
                    double dDoubleValue = ((Number) obj).doubleValue();
                    if (dDoubleValue > 9.999999999999998E12d || dDoubleValue < -9.999999999999998E12d) {
                        TDLog.d(TAG, "The number value [" + obj + "] is invalid.");
                    }
                }
            } catch (JSONException e2) {
                TDLog.d(TAG, "Unexpected parameters." + e2);
                return false;
            }
        }
        return true;
    }

    public static byte[] cutToBytes(String s2, int charLimit) throws UnsupportedEncodingException {
        int i2;
        int i3;
        byte[] bytes = s2.getBytes(C.UTF8_NAME);
        if (bytes.length <= charLimit) {
            return bytes;
        }
        if ((bytes[charLimit] & 128) == 0) {
            return Arrays.copyOf(bytes, charLimit);
        }
        int i4 = 0;
        while (true) {
            i2 = charLimit - i4;
            i3 = i2 - 1;
            if ((bytes[i3] & 128) <= 0 || (bytes[i3] & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                break;
            }
            i4++;
        }
        if ((bytes[i3] & 128) > 0) {
            return Arrays.copyOf(bytes, i3);
        }
        return Arrays.copyOf(bytes, i2);
    }
}
