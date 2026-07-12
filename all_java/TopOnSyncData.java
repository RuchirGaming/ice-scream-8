package cn.thinkinganalyticsclone.android.thirdparty;

import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TopOnSyncData extends AbstractSyncThirdData {
    private final Map<String, Object> mCustomMap;

    public TopOnSyncData(String distinctId, Map<String, Object> mCustomMap) {
        super(distinctId);
        this.mCustomMap = mCustomMap;
    }

    @Override // cn.thinkinganalyticsclone.android.thirdparty.ISyncThirdPartyData
    public void syncThirdPartyData() {
        try {
            Method method = Class.forName("com.anythink.core.api.ATSDK").getMethod("initCustomMap", Map.class);
            HashMap map = new HashMap();
            map.put((String) Class.forName("com.anythink.core.api.ATCustomRuleKeys").getField("USER_ID").get(null), this.distinctId == null ? "" : this.distinctId);
            Map<String, Object> map2 = this.mCustomMap;
            if (map2 != null) {
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            method.invoke(null, map);
        } catch (Exception e2) {
            TDLog.e("ThinkingAnalyticsClone.SyncData", "TopOn数据同步异常:" + e2.getMessage());
        }
    }
}
