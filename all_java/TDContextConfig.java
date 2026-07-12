package cn.thinkinganalyticsclone.android;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TDContextConfig {
    private static final int DEFAULT_MIN_DB_LIMIT = 10000;
    private static final int DEFAULT_RETENTION_DAYS = 10;
    private static final String KEY_MAIN_PROCESS_NAME = "TACloneDeFaultMainProcessName";
    private static final String KEY_MIN_DB_LIMIT = "TACloneDatabaseLimit";
    private static final String KEY_RETENTION_DAYS = "TACloneRetentionDays";
    private static final Map<Context, TDContextConfig> sInstanceMap = new HashMap();
    private String mMainProcessName;
    private int mMinimumDatabaseLimit;
    private int mRetentionDays;

    public static TDContextConfig getInstance(Context context) {
        TDContextConfig tDContextConfig;
        Map<Context, TDContextConfig> map = sInstanceMap;
        synchronized (map) {
            tDContextConfig = map.get(context);
            if (tDContextConfig == null) {
                tDContextConfig = new TDContextConfig(context);
                map.put(context, tDContextConfig);
            }
        }
        return tDContextConfig;
    }

    private TDContextConfig(Context context) {
        this.mRetentionDays = 10;
        this.mMinimumDatabaseLimit = 10000;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        try {
            this.mMainProcessName = packageName;
            this.mMainProcessName = resources.getString(resources.getIdentifier(KEY_MAIN_PROCESS_NAME, "string", packageName));
        } catch (Exception unused) {
        }
        try {
            this.mRetentionDays = resources.getInteger(resources.getIdentifier(KEY_RETENTION_DAYS, "integer", packageName));
        } catch (Exception unused2) {
        }
        try {
            this.mMinimumDatabaseLimit = resources.getInteger(resources.getIdentifier(KEY_MIN_DB_LIMIT, "integer", packageName));
        } catch (Exception unused3) {
        }
        TDPresetProperties.initDisableList(context);
    }

    public String getMainProcessName() {
        return this.mMainProcessName;
    }

    int getMinimumDatabaseLimit() {
        return this.mMinimumDatabaseLimit;
    }

    long getDataExpiration() {
        return ((long) this.mRetentionDays) * 86400000;
    }
}
