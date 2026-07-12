package cn.thinkinganalyticsclone.android.thirdparty;

import cn.thinkinganalyticsclone.android.utils.TDConstants;
import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class AppsFlyerSyncData extends AbstractSyncThirdData {
    private final Map<String, Object> mCustomMap;

    public AppsFlyerSyncData(String distinctId, String accountId, Map<String, Object> mCustomMap) {
        super(distinctId, accountId);
        this.mCustomMap = mCustomMap;
    }

    @Override // cn.thinkinganalyticsclone.android.thirdparty.ISyncThirdPartyData
    public void syncThirdPartyData() {
        TDLog.d("ThinkingAnalyticsClone.SyncData", "开始同步Appsflyer数据");
        try {
            HashMap map = new HashMap();
            String str = "";
            map.put(TDConstants.TA_DISTINCT_ID, this.distinctId == null ? "" : this.distinctId);
            if (this.accountId != null) {
                str = this.accountId;
            }
            map.put(TDConstants.TA_ACCOUNT_ID, str);
            Map<String, Object> map2 = this.mCustomMap;
            if (map2 != null) {
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            cls.getMethod("setAdditionalData", Map.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), map);
        } catch (Exception e2) {
            TDLog.e("ThinkingAnalyticsClone.SyncData", "AppsFlyer数据同步异常:" + e2.getMessage());
        }
    }
}
