package cn.thinkinganalyticsclone.android.thirdparty;

import cn.thinkinganalyticsclone.android.utils.TDConstants;
import cn.thinkinganalyticsclone.android.utils.TDLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public class BranchSyncData extends AbstractSyncThirdData {
    public BranchSyncData(String distinctId, String accountId) {
        super(distinctId, accountId);
    }

    @Override // cn.thinkinganalyticsclone.android.thirdparty.ISyncThirdPartyData
    public void syncThirdPartyData() {
        TDLog.d("ThinkingAnalyticsClone.SyncData", "开始同步Branch数据");
        try {
            Class<?> cls = Class.forName("io.branch.referral.Branch");
            Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method method = cls.getMethod("setRequestMetadata", String.class, String.class);
            Object[] objArr = new Object[2];
            objArr[0] = TDConstants.TA_DISTINCT_ID;
            String str = "";
            objArr[1] = this.distinctId == null ? "" : this.distinctId;
            method.invoke(objInvoke, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = TDConstants.TA_ACCOUNT_ID;
            if (this.accountId != null) {
                str = this.accountId;
            }
            objArr2[1] = str;
            method.invoke(objInvoke, objArr2);
        } catch (Exception e2) {
            TDLog.e("ThinkingAnalyticsClone.SyncData", "Branch数据同步异常:" + e2.getMessage());
        }
    }
}
