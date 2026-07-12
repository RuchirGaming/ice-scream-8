package cn.thinkinganalyticsclone.android.thirdparty;

import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TradPlusSyncData extends AbstractSyncThirdData {
    public TradPlusSyncData(String distinctId) {
        super(distinctId);
    }

    @Override // cn.thinkinganalyticsclone.android.thirdparty.ISyncThirdPartyData
    public void syncThirdPartyData() {
        TDLog.d("ThinkingAnalyticsClone.SyncData", "开始同步TradPlus数据");
        try {
            Method method = Class.forName("com.tradplus.ads.mobileads.util.SegmentUtils").getMethod("initCustomMap", Map.class);
            HashMap map = new HashMap();
            map.put((String) Class.forName("com.tradplus.ads.mobileads.util.AppKeyManager").getField("CUSTOM_USERID").get(null), this.distinctId == null ? "" : this.distinctId);
            method.invoke(null, map);
        } catch (Exception e2) {
            TDLog.e("ThinkingAnalyticsClone.SyncData", "TradPlus数据同步异常:" + e2.getMessage());
        }
    }
}
