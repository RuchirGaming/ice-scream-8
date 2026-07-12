package cn.thinkinganalyticsclone.android.thirdparty;

import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class TrackingSyncData extends AbstractSyncThirdData {
    public TrackingSyncData(String distinctId) {
        super(distinctId);
    }

    @Override // cn.thinkinganalyticsclone.android.thirdparty.ISyncThirdPartyData
    public void syncThirdPartyData() {
        TDLog.d("ThinkingAnalyticsClone.SyncData", "开始同步热云数据");
        try {
            Method method = Class.forName("com.reyun.tracking.sdk.Tracking").getMethod("setRegisterWithAccountID", String.class);
            Object[] objArr = new Object[1];
            objArr[0] = this.distinctId == null ? "" : this.distinctId;
            method.invoke(null, objArr);
        } catch (Exception e2) {
            TDLog.e("ThinkingAnalyticsClone.SyncData", "Tracking数据同步异常:" + e2.getMessage());
        }
    }
}
