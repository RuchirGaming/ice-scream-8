package cn.thinkinganalyticsclone.android;

import android.content.Context;
import android.content.res.Resources;
import cn.thinkinganalyticsclone.android.utils.TDConstants;
import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDPresetProperties {
    private static final String TAG = "ThinkingAnalyticsClone.TDPresetProperties";
    public static final List<String> disableList = new ArrayList();
    public String appVersion;
    public String bundleId;
    public String carrier;
    public String deviceId;
    public String deviceModel;
    public String disk;
    public int fps;
    public String installTime;
    public boolean isSimulator;
    public String manufacture;
    public String networkType;
    public String os;
    public String osVersion;
    private JSONObject presetProperties;
    public String ram;
    public int screenHeight;
    public int screenWidth;
    public String systemLanguage;
    public double zoneOffset;

    public TDPresetProperties(JSONObject presetProperties) {
        this.presetProperties = presetProperties;
        List<String> list = disableList;
        if (!list.contains(TDConstants.KEY_BUNDLE_ID)) {
            this.bundleId = presetProperties.optString(TDConstants.KEY_BUNDLE_ID);
        }
        if (!list.contains(TDConstants.KEY_CARRIER)) {
            this.carrier = presetProperties.optString(TDConstants.KEY_CARRIER);
        }
        if (!list.contains(TDConstants.KEY_DEVICE_ID)) {
            this.deviceId = presetProperties.optString(TDConstants.KEY_DEVICE_ID);
        }
        if (!list.contains(TDConstants.KEY_DEVICE_MODEL)) {
            this.deviceModel = presetProperties.optString(TDConstants.KEY_DEVICE_MODEL);
        }
        if (!list.contains(TDConstants.KEY_MANUFACTURER)) {
            this.manufacture = presetProperties.optString(TDConstants.KEY_MANUFACTURER);
        }
        if (!list.contains(TDConstants.KEY_NETWORK_TYPE)) {
            this.networkType = presetProperties.optString(TDConstants.KEY_NETWORK_TYPE);
        }
        if (!list.contains(TDConstants.KEY_OS)) {
            this.os = presetProperties.optString(TDConstants.KEY_OS);
        }
        if (!list.contains(TDConstants.KEY_OS_VERSION)) {
            this.osVersion = presetProperties.optString(TDConstants.KEY_OS_VERSION);
        }
        if (!list.contains(TDConstants.KEY_SCREEN_HEIGHT)) {
            this.screenHeight = presetProperties.optInt(TDConstants.KEY_SCREEN_HEIGHT);
        }
        if (!list.contains(TDConstants.KEY_SCREEN_WIDTH)) {
            this.screenWidth = presetProperties.optInt(TDConstants.KEY_SCREEN_WIDTH);
        }
        if (!list.contains(TDConstants.KEY_SYSTEM_LANGUAGE)) {
            this.systemLanguage = presetProperties.optString(TDConstants.KEY_SYSTEM_LANGUAGE);
        }
        if (!list.contains(TDConstants.KEY_ZONE_OFFSET)) {
            this.zoneOffset = presetProperties.optDouble(TDConstants.KEY_ZONE_OFFSET);
        }
        if (!list.contains(TDConstants.KEY_APP_VERSION)) {
            this.appVersion = presetProperties.optString(TDConstants.KEY_APP_VERSION);
        }
        if (!list.contains(TDConstants.KEY_INSTALL_TIME)) {
            this.installTime = presetProperties.optString(TDConstants.KEY_INSTALL_TIME);
        }
        if (!list.contains(TDConstants.KEY_SIMULATOR)) {
            this.isSimulator = presetProperties.optBoolean(TDConstants.KEY_SIMULATOR);
        }
        if (!list.contains(TDConstants.KEY_RAM)) {
            this.ram = presetProperties.optString(TDConstants.KEY_RAM);
        }
        if (!list.contains(TDConstants.KEY_DISK)) {
            this.disk = presetProperties.optString(TDConstants.KEY_DISK);
        }
        if (list.contains(TDConstants.KEY_FPS)) {
            return;
        }
        this.fps = presetProperties.optInt(TDConstants.KEY_FPS);
    }

    public JSONObject toEventPresetProperties() {
        return this.presetProperties;
    }

    public TDPresetProperties() {
    }

    static void initDisableList(Context context) {
        List<String> list = disableList;
        synchronized (list) {
            if (list.isEmpty()) {
                try {
                    Resources resources = context.getResources();
                    list.addAll(Arrays.asList(resources.getStringArray(resources.getIdentifier("TACloneDisPresetProperties", "array", context.getPackageName()))));
                } catch (Exception e2) {
                    TDLog.e(TAG, e2.toString());
                } catch (NoClassDefFoundError e3) {
                    TDLog.e(TAG, e3.toString());
                }
            }
        }
    }

    static void initDisableList(String[] mArray) {
        List<String> list = disableList;
        synchronized (list) {
            list.clear();
            list.addAll(Arrays.asList(mArray));
        }
    }
}
